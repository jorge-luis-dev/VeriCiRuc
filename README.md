# VeriCiRuc
Verfica, valida  la Cédula y RUC de Ecuador en Kotlin y Java

1. Instala Kotlin

2. Abre el shell e ingresa a la carpeta

        $ cd ./src/com/documento

3. Compila los archivos y genera el archivo jar

        $ kotlinc Ci.kt Ruc.kt -include-runtime -d CiRuc.jar

4. Añade a tu proyecto Java

## Añadir al repositorio maven local
        $ mvn install:install-file -Dfile=CiRuc.jar -DgroupId=com.documento -DartifactId=CiRuc -Dversion=1.0 -Dpackaging=jar

