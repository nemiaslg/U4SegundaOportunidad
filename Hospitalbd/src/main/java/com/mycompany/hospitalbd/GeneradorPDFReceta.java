package com.mycompany.hospitalbd;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class GeneradorPDFReceta {

    public static boolean generar(
            Receta receta,
            String nombrePaciente,
            String observaciones) {

        String carpetaUsuario
                = System.getProperty("user.home");

        File carpetaRecetas
                = new File(carpetaUsuario, "RecetasHospital");

        if (!carpetaRecetas.exists()
                && !carpetaRecetas.mkdirs()) {

            System.out.println(
                    "No se pudo crear la carpeta de recetas."
            );

            return false;
        }

        String fechaArchivo = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")
        );

        String nombreArchivo
                = "Receta_"
                + receta.getIdConsulta()
                + "_"
                + fechaArchivo
                + ".pdf";

        File archivoPDF
                = new File(carpetaRecetas, nombreArchivo);

        try (PDDocument documento = new PDDocument()) {

            PDPage pagina
                    = new PDPage(PDRectangle.LETTER);

            documento.addPage(pagina);

            PDType1Font fuenteNormal
                    = new PDType1Font(
                            Standard14Fonts.FontName.HELVETICA
                    );

            PDType1Font fuenteNegrita
                    = new PDType1Font(
                            Standard14Fonts.FontName.HELVETICA_BOLD
                    );

            try (PDPageContentStream contenido
                    = new PDPageContentStream(
                            documento,
                            pagina
                    )) {

                float margenIzquierdo = 60;
                float posicionY = 720;
                float interlineado = 25;

                escribirTexto(
                        contenido,
                        fuenteNegrita,
                        20,
                        margenIzquierdo,
                        posicionY,
                        "HOSPITAL - RECETA MÉDICA"
                );

                posicionY -= 35;

                contenido.moveTo(margenIzquierdo, posicionY);
                contenido.lineTo(550, posicionY);
                contenido.stroke();

                posicionY -= 35;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "ID consulta:",
                        String.valueOf(receta.getIdConsulta())
                );

                posicionY -= interlineado;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Paciente:",
                        nombrePaciente
                );

                posicionY -= interlineado;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Fecha de emisión:",
                        LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern(
                                        "dd/MM/yyyy HH:mm"
                                )
                        )
                );

                posicionY -= 40;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Medicamento:",
                        receta.getMedicamento()
                );

                posicionY -= interlineado;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Dosis:",
                        receta.getDosis()
                );

                posicionY -= interlineado;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Frecuencia:",
                        receta.getFrecuencia()
                );

                posicionY -= interlineado;

                escribirCampo(
                        contenido,
                        fuenteNegrita,
                        fuenteNormal,
                        margenIzquierdo,
                        posicionY,
                        "Duración:",
                        receta.getDuracion()
                );

                posicionY -= 40;

                escribirTexto(
                        contenido,
                        fuenteNegrita,
                        12,
                        margenIzquierdo,
                        posicionY,
                        "Indicaciones:"
                );

                posicionY -= 20;

                posicionY = escribirParrafo(
                        contenido,
                        fuenteNormal,
                        11,
                        margenIzquierdo,
                        posicionY,
                        480,
                        receta.getIndicaciones()
                );

                if (observaciones != null
                        && !observaciones.trim().isEmpty()) {

                    posicionY -= 25;

                    escribirTexto(
                            contenido,
                            fuenteNegrita,
                            12,
                            margenIzquierdo,
                            posicionY,
                            "Observaciones:"
                    );

                    posicionY -= 20;

                    escribirParrafo(
                            contenido,
                            fuenteNormal,
                            11,
                            margenIzquierdo,
                            posicionY,
                            480,
                            observaciones
                    );
                }

                escribirTexto(
                        contenido,
                        fuenteNormal,
                        10,
                        margenIzquierdo,
                        70,
                        "Documento generado por el sistema Hospitalbd."
                );
            }

            documento.save(archivoPDF);

            abrirPDF(archivoPDF);

            return true;

        } catch (IOException e) {

            System.out.println(
                    "Error al generar el PDF: "
                    + e.getMessage()
            );

            return false;
        }
    }

    private static void escribirTexto(
            PDPageContentStream contenido,
            PDType1Font fuente,
            float tamaño,
            float x,
            float y,
            String texto) throws IOException {

        contenido.beginText();
        contenido.setFont(fuente, tamaño);
        contenido.newLineAtOffset(x, y);
        contenido.showText(limpiarTexto(texto));
        contenido.endText();
    }

    private static void escribirCampo(
            PDPageContentStream contenido,
            PDType1Font fuenteNegrita,
            PDType1Font fuenteNormal,
            float x,
            float y,
            String etiqueta,
            String valor) throws IOException {

        escribirTexto(
                contenido,
                fuenteNegrita,
                11,
                x,
                y,
                etiqueta
        );

        escribirTexto(
                contenido,
                fuenteNormal,
                11,
                x + 110,
                y,
                valor == null ? "" : valor
        );
    }

    private static float escribirParrafo(
            PDPageContentStream contenido,
            PDType1Font fuente,
            float tamaño,
            float x,
            float y,
            float anchoMaximo,
            String texto) throws IOException {

        if (texto == null || texto.trim().isEmpty()) {
            return y;
        }

        String[] palabras = texto.trim().split("\\s+");
        StringBuilder linea = new StringBuilder();

        for (String palabra : palabras) {

            String lineaPrueba
                    = linea.isEmpty()
                    ? palabra
                    : linea + " " + palabra;

            float ancho
                    = fuente.getStringWidth(
                            limpiarTexto(lineaPrueba)
                    ) / 1000 * tamaño;

            if (ancho > anchoMaximo
                    && !linea.isEmpty()) {

                escribirTexto(
                        contenido,
                        fuente,
                        tamaño,
                        x,
                        y,
                        linea.toString()
                );

                y -= 16;
                linea = new StringBuilder(palabra);

            } else {

                linea = new StringBuilder(lineaPrueba);
            }
        }

        if (!linea.isEmpty()) {

            escribirTexto(
                    contenido,
                    fuente,
                    tamaño,
                    x,
                    y,
                    linea.toString()
            );

            y -= 16;
        }

        return y;
    }

    private static String limpiarTexto(String texto) {

        if (texto == null) {
            return "";
        }

        return texto
                .replace("–", "-")
                .replace("—", "-")
                .replace("\n", " ")
                .replace("\r", " ");
    }

    private static void abrirPDF(File archivoPDF) {

        try {

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(archivoPDF);
            }

        } catch (IOException e) {

            System.out.println(
                    "El PDF fue creado, pero no pudo abrirse: "
                    + e.getMessage()
            );
        }
    }
}
