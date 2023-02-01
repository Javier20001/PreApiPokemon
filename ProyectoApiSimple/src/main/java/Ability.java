import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ability {
    @Expose
    private String name;


    public Ability(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }

}
