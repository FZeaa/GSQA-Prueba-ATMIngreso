## GSQA-Prueba-ATMIngreso 🧑‍🍳 Federico Zea
### Modulo Diseño:
Los 3TCs fueron establecidos en la Homepage de la pagina de latam airlines utilizando el lenguaje Gherkin que
permite la facil compresion del las prubas. Los TCs se puede ver en el file [Latam.feature](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/features/Latam.feature)

### Modulo Arquitectura:
1. Patrones de Arquitectura de pruebas:
    - BDD Pattern: Este patrón de arquitectura se basa en enfocar el desarrollo en el comportamiento de la aplicación, lo que mejora la comunicación entre los equipos.
      Fue implementado utilizando Gherkin en el archivo [Latam.feature](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/features/Latam.feature)
    - POM Pattern: Al usar un Page Object Model File se organiza el codigo de cierta forma que todos los Xpath y locators esten
      en Files especificos lo cual ayuda para reutilizarlos en distintas parte del codigo, como en los StepDefinition, este patro fue implementado en el
      file [LatamPageSteps.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/test/java/stepDefinitions/LatamPageSteps.java)
      ademas de esta forma tambien facilita el mantenimiento del codigo
    - Utils Pattern: Se agrupan todos los metodos repetitivos y reutulizables en clases especificas, lo cual permite que los StepsDefitinion
      tenga una estuctura mas organizada y limpia, ademas de que reduce la duplicacion de codigo y el mantemiento, este patron se puede ver en los Files
      [DateHelper.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/main/java/utils/DateHelper.java) y [AssertUtil.java](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/src/main/java/utils/AssertUtil.java)
2. Diagrama de patrones de Arquitectura:
    - Se uso Draw.io para realizar el diagrama, Puede visualizarse en el siguiente [PDF](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/GSQADiagramaDePruebas.drawio.pdf)
  
 ###  Modulo DevOps:
 1. ¿Puedes asesorarnos en cuanto a cómo debería quedar la estrategia para el despliegue y
ejecución de estas automatizaciones?
    - Para garantizar que las pruebas se ejecuten de manera automatizada en cada cambio de código,
      se recomienda usar herramientas de CI/CD como GitHub Actions o Azure DevOps
    - Para la ejucion de las pruebas se puede utilizar distintos ambientes como Dev, QA y PROD
    - Se recomienda ejecutar las pruebas automatizadas cada vez que haya cambios en estos entornos y cuando sea necesario
      realizar una prueba de regresión para verificar que las modificaciones no afecten funcionalidades existentes.
2. ¿Cuántos pipelines debería haber incluyendo los que despliegan el desarrollo?
   - Recomendaria utilizar 4 pipelines, de la siguiente forma:
       1. Build y Despliegue - Trigger merge al main
       2. Pruebas en QA - Trigger Despliegue en ambiente de QA
       3. Smoke Test Prod - Trigger Despliegues en ambiente de Prod
       4. Pruenas de Regresion - Trigger Programado a una hora especifica
   - Tener en cuenta que la cantidad de pipelines siempre estara dada por las necesidades del proyecto y su envergadura     
3. ¿En cuál pipeline debería correr cada una de las pruebas, las UI y las unitarias?
   -  Las Puerbas UI pueden correr en el pipeline de Pruebas QA y el Smoke Test, por otra parte las
     prubas unitarias se pueden ejecutra en el pipeline Build y Despliegue
4. ¿Hay algún tipo de pruebas que se pueda agregar extra y en cual pipeline debería ir?
    -  Se pueden agregar pruebas de Carga y Performance, estas deberia ir en su propio pipeline y su trigger puede ser antes y
      despues de un despliegue importante
5. ¿Cómo plantearías la infraestructura de ejecución para las pruebas anteriormente
desarrolladas? Puedes incluir un diagrama sencillo donde se pueda reflejar tu respuesta,
podrías incluir herramientas específicas de tu preferencia
    - Para plantearse la infresturctura de ejecucio se debe de tener en cuenta los siguientes Componente Clave:
        1. Repositorio de Codigo: GitHub
        2. CI/CD: Azure DevOps
        3. Entornos de prueba: Ambientes de QA y Prod
        4. Reportes: Cucumber y/o TestRail
    - El Diagrama se puede visulizar en el siguiente [Imagen](https://github.com/FZeaa/GSQA-Prueba-ATMIngreso/blob/master/Diagrama%20infraestructura.png) 
  


