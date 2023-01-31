import java.util.List;

public class Pokemon {
    private String name;
    private int base_experience;
    private List<Ability> abilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ability> getAbilities() {
        return this.abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
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
            " name='" + getName() + "'" +
            ", abilities='" + getAbilities() + "'" +"base experience="+getBase_experience()+
            "}";
    }

}
