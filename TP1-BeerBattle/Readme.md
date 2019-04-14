Que es Maven:
Maven es una herramienta de software para la gestión de dependencias y construcción de proyectos Java.

Que es POM:
Maven utiliza un Project Object Model (POM) para describir el proyecto de software a construir,
sus dependencias de otros módulos y componentes externos, y el órden de construcción de los elementos.
Es un archivo XML que Maven lee antes de ejecutar un proyecto y descarga las dependencias.

Diferencia entre Archetype y Artifact:
Un Archetype es un patrón, modelo o plantilla sobre el que se pueden desarrollar todas aquellas tareas que son de un mismo tipo.
Un Artifact es un bloque de código reutilizable instalado en el repositorio.

Maven goals:
Un goal es un comando que recibe maven como parámetro.

mvn clean: limpia todas las clases compiladas del proyecto.

mvn package: empaqueta el proyecto (si es un proyecto simple genera un jar, si es un proyecto web un war).

mvn install: installa el artifact en el repositorio local.

mvn compile: compila el proyecto.

Maven Scopes:
El scope sirve para indicar el alcance de nuestra dependencia.

compile: Indica que la dependencia es necesaria para compilar. Es la que viene por defecto y se propaga en los proyectos dependientes.

provided: Es como la anterior, pero se espera que el contenedor ya contenga esa librería.

runtime: Indica que es una dependencia necesaria en tiempo de ejecución pero no para compilar.

test: La dependencia es solo para testing que es una de las fases de la compilación con maven.

system: Es como provided pero se debe incluir la dependencia explisitamente. No se buscará en el repo local. Habrá que especificar
la ruta de la dependencia mediante la etiqueta <systemPath> 

