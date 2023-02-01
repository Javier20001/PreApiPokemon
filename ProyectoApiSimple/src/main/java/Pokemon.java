

public class Pokemon {
    private String name;
    private PokemonAbilities[] abilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PokemonAbilities[] getAbilities() {
        return this.abilities;
    }

    public void setAbilities(PokemonAbilities[] abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        String ability = "";
        for (PokemonAbilities pokemonAbilities : abilities) {
            ability += pokemonAbilities.toString();
        }
        return "{" +
            " name='" + getName() + "'" +
            ", abilities='" + ability + "'" +
            "}";
    }

}
