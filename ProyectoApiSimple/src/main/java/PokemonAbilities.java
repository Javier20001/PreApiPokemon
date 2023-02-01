import java.util.List;

class PokemonAbilities{
    private int slot;
    private int base_experience;
    private Ability ability;


    public int getSlot() {
        return this.slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Ability getAbility() {
        return this.ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
    
    public int getBase_experience() {
        return this.base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    @Override
    public String toString() {
        return "{" +
            " slot='" + getSlot() + "'" +
            ", base_experience='" + getBase_experience() + "'" +
            ", ability='" + getAbility() + "'" +
            "}";
    }

}