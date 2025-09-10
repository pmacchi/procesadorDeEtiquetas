# Label Processor

Este proyecto en Java facilita la conversión de etiquetas ZPL de 200 dpi a 300 dpi.

## Descripción
Busca archivos ".prn" en las carpetas espécificas y convierte dichas etiquetas de 200 dpi en etiquetas de 300 dpi usando un script en Python. Luego los envía automáticamente a una impresora Zebra y limpia las carpetas utilizadas.

## Funcionalidades
- Detecta archivos ".prn" en la carpeta "Documents"
- Mueve los archivos a una carpeta "spool" que genera automáticamente.
- Ejecuta un script Python para convertir la resolución
- Imprime los archivos convertidos
- Limpia las carpetas al finalizar

## Archivos
- "FilesProcessor": busca archivos ".prn"
- "FilesMove": mueve los archivos a la carpeta de spool
- "ZPLConverterCaller": llama al script Python para convertir
- "EtiquetaPrinter": envía los archivos a la impresora
- "CarpetaCleaner": borra los archivos procesados
- "SAPLabelProcessorFacade": Patrón de Diseño Facade para organizar todo
