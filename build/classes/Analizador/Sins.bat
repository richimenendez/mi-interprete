SET JAVA_HOME = "C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH = %JAVA_HOME% ; %PATH%
SET CLASSPATH = %JAVA_HOME%;
cd = C:\Users\Richi\OneDrive\Documents\NetBeansProjects\JavaApplication4\src\Analizador
java -jar C:\Users\Richi\OneDrive\Documents\NetBeansProjects\JavaApplication4\java-cup-11b.jar -parser SParser -symbols SSimbolos Sins.cup
pause
