package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 1.0",
        description = "Compares two configuration files and shows a difference.")
public class App {
    @Option(names = {"-f", "--format"}, description = "output format [default: stylish]", defaultValue = "stylish", paramLabel = "format")
    String format;

    @CommandLine.Parameters(paramLabel = "filepath1", description = "path to first file")
    String firstPath;

    @CommandLine.Parameters(paramLabel = "filepath2", description = "path to second file")
    String secondPath;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}