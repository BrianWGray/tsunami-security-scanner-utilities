package tsunami.security.scanner.utilities;

import org.graalvm.compiler.lir.LIR;

import java.util.List;

public class Kustomization {
    private List<String> name;
    private List<String> literals;
    private List<String> resources;

    public List<String> getName(){
        return name;
    }

    public void setName(List<String> name){
        this.name = name;
    }

    public List<String> getLiterals(){
        return literals;
    }

    public void setLiterals(List<String> literals){
        this.literals = literals;
    }

    public List<String> getResources(){
        return resources;
    }

    public void setResources(List<String> resources){
        this.resources = resources;
    }
}