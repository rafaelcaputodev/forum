package br.com.alura.forum.config;

public class ErroDeFormularioDTO {
    private String name;
    private String message;

    public ErroDeFormularioDTO(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }


}
