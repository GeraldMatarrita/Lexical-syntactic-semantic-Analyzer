#Lexical, Syntactic, and Semantic Analyzer

This lexical and semantic analyzer can be executed using the .JAR file located in the compressed folder of this project.
Please ensure you have Java 18 or higher installed, as the program is compiled with this version.

## How to Run
Unzip the .zip file to a directory of your choice.

Open a terminal or CMD in that directory.

Execute the following command:

```
java -jar miCompilador.jar prueba1.ml output.txt
```

### Important Notes
The input file must have the .ml extension, which is designated for files written in miLenguaje. Example files can be found in the root folder of the project under miCompilador.
For the first two example files, output files have been created with the results obtained by the compiler. However, the other two example files do not have corresponding output files as they contain errors.
Success Message
After running the JAR file, you should see the following message (in case of success):

```
Return 'value'
```

If there is an error in the input.txt file, an error message will be displayed, and execution will stop, resulting in no output.txt file being generated.

## Output File
The output.txt file will contain the results obtained from each phase of the compiler:

Lexical Analyzer: Displays the symbol table.
Syntactic Analyzer: Displays the syntax tree.
Semantic Analyzer: Shows the symbol table with the data types of each variable or function.
