# GSQA-Prueba-ATMIngreso 🧑‍🍳 Federico Zea

## Módulo Diseño:
Los 3TCs fueron establecidos en la Homepage de la página de Latam Airlines utilizando el lenguaje Gherkin que
permite la fácil comprensión de las pruebas. Los TCs se pueden ver en el file [Latam.feature](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/features/Latam.feature)

## Módulo Arquitectura:
1. Patrones de Arquitectura de pruebas:
    - El Behavior Driven Development (BDD) permite enfocar el desarrollo en el comportamiento esperado de la aplicación, mejorando la comunicación entre equipos técnicos y de negocio. En este proyecto, se implementó utilizando Gherkin en el archivo [Latam.feature](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/features/Latam.feature), lo que facilita la escritura de escenarios legibles para todos los involucrados
    - POM Pattern: Este patrón permite organizar el código separando los localizadores y acciones de cada página en archivos específicos, mejorando la reutilización y mantenimiento. En este caso, se implementó en [LatamPageSteps.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/test/java/stepDefinitions/LatamPageSteps.java), donde los localizadores se centralizan para evitar redundancia y facilitar modificaciones futuras
    - Utils Pattern: Se agruparon métodos reutilizables en clases específicas para mantener una estructura más organizada y reducir la duplicación de código. Ejemplos de esto son [DateHelper.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/main/java/utils/DateHelper.java) y [AssertUtil.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/main/java/utils/AssertUtil.java), que contienen funciones comunes utilizadas en los Step Definitions, garantizando mayor mantenibilidad y modularidad
2. Diagrama de patrones de Arquitectura:
    - Se usó Draw.io para realizar el diagrama. Puede visualizarse en el siguiente [PDF](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/GSQADiagramaDePruebas.drawio.pdf)
  
##  Módulo DevOps:
1. ¿Puedes asesorarnos en cuanto a cómo debería quedar la estrategia para el despliegue y
ejecución de estas automatizaciones?
    - Para garantizar que las pruebas se ejecuten de manera automatizada en cada cambio de código,
      se recomienda usar herramientas de CI/CD como GitHub Actions o Azure DevOps
    - Para la ejecución de las pruebas se pueden utilizar distintos ambientes como Dev, QA y PROD
    - Se recomienda ejecutar las pruebas automatizadas cada vez que haya cambios en estos entornos y cuando sea necesario
      realizar una prueba de regresión para verificar que las modificaciones no afecten funcionalidades existentes.
2. ¿Cuántos pipelines debería haber incluyendo los que despliegan el desarrollo?
   - Recomendaría utilizar 4 pipelines, de la siguiente forma:
       1. Build y Despliegue - Trigger merge al main
       2. Pruebas en QA - Trigger Despliegue en ambiente de QA
       3. Smoke Test Prod - Trigger Despliegues en ambiente de Prod
       4. Pruebas de Regresión - Trigger Programado a una hora específica
  > Nota: La cantidad de pipelines puede variar según la complejidad del proyecto y los requerimientos del equipo de desarrollo.  
3. ¿En cuál pipeline debería correr cada una de las pruebas, las UI y las unitarias?
   -  Las Pruebas UI pueden correr en el pipeline de Pruebas QA y el Smoke Test, por otra parte las
     pruebas unitarias se pueden ejecutar en el pipeline Build y Despliegue
4. ¿Hay algún tipo de pruebas que se pueda agregar extra y en cuál pipeline debería ir?
    -  Se pueden agregar pruebas de Carga y Performance, estas deberían ir en su propio pipeline y su trigger puede ser antes y
      después de un despliegue importante
5. ¿Cómo plantearías la infraestructura de ejecución para las pruebas anteriormente
desarrolladas? Puedes incluir un diagrama sencillo donde se pueda reflejar tu respuesta,
podrías incluir herramientas específicas de tu preferencia
    - Para plantearse la infraestructura de ejecución se debe tener en cuenta los siguientes Componentes Clave:
        1. Repositorio de Código: GitHub
        2. CI/CD: Azure DevOps
        3. Entornos de prueba: Ambientes de QA y Prod
        4. Reportes: Cucumber y/o TestRail
    - El Diagrama se puede visualizar en la siguiente [Imagen](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/Diagrama%20infraestructura.png)
