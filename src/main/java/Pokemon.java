import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Number",
    "Name",
    "Generation",
    "About",
    "Types",
    "Resistant",
    "Weaknesses",
    "Fast Attack(s)",
    "Special Attack(s)",
    "Weight",
    "Height",
    "Buddy Distance",
    "Base Stamina",
    "Base Attack",
    "Base Defense",
    "Base Flee Rate",
    "Next Evolution Requirements",
    "Next evolution(s)",
    "MaxCP",
    "MaxHP"
})
public class Pokemon {

    @JsonProperty("Number")
    private String number;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Generation")
    private String generation;
    @JsonProperty("About")
    private String about;
    @JsonProperty("Types")
    private List<String> types = null;
    @JsonProperty("Resistant")
    private List<String> resistant = null;
    @JsonProperty("Weaknesses")
    private List<String> weaknesses = null;
    @JsonProperty("Fast Attack(s)")
    private List<FastAttackS> fastAttackS = null;
    @JsonProperty("Special Attack(s)")
    private List<SpecialAttackS> specialAttackS = null;
    @JsonProperty("Weight")
    private Weight weight;
    @JsonProperty("Height")
    private Height height;
    @JsonProperty("Buddy Distance")
    private String buddyDistance;
    @JsonProperty("Base Stamina")
    private String baseStamina;
    @JsonProperty("Base Attack")
    private String baseAttack;
    @JsonProperty("Base Defense")
    private String baseDefense;
    @JsonProperty("Base Flee Rate")
    private String baseFleeRate;
    @JsonProperty("Next Evolution Requirements")
    private NextEvolutionRequirements nextEvolutionRequirements;
    @JsonProperty("Next evolution(s)")
    private List<NextEvolutionS> nextEvolutionS = null;
    @JsonProperty("MaxCP")
    private Integer maxCP;
    @JsonProperty("MaxHP")
    private Integer maxHP;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Generation")
    public String getGeneration() {
        return generation;
    }

    @JsonProperty("Generation")
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @JsonProperty("About")
    public String getAbout() {
        return about;
    }

    @JsonProperty("About")
    public void setAbout(String about) {
        this.about = about;
    }

    @JsonProperty("Types")
    public List<String> getTypes() {
        return types;
    }

    @JsonProperty("Types")
    public void setTypes(List<String> types) {
        this.types = types;
    }

    @JsonProperty("Resistant")
    public List<String> getResistant() {
        return resistant;
    }

    @JsonProperty("Resistant")
    public void setResistant(List<String> resistant) {
        this.resistant = resistant;
    }

    @JsonProperty("Weaknesses")
    public List<String> getWeaknesses() {
        return weaknesses;
    }

    @JsonProperty("Weaknesses")
    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    @JsonProperty("Fast Attack(s)")
    public List<FastAttackS> getFastAttackS() {
        return fastAttackS;
    }

    @JsonProperty("Fast Attack(s)")
    public void setFastAttackS(List<FastAttackS> fastAttackS) {
        this.fastAttackS = fastAttackS;
    }

    @JsonProperty("Special Attack(s)")
    public List<SpecialAttackS> getSpecialAttackS() {
        return specialAttackS;
    }

    @JsonProperty("Special Attack(s)")
    public void setSpecialAttackS(List<SpecialAttackS> specialAttackS) {
        this.specialAttackS = specialAttackS;
    }

    @JsonProperty("Weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @JsonProperty("Height")
    public Height getHeight() {
        return height;
    }

    @JsonProperty("Height")
    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonProperty("Buddy Distance")
    public String getBuddyDistance() {
        return buddyDistance;
    }

    @JsonProperty("Buddy Distance")
    public void setBuddyDistance(String buddyDistance) {
        this.buddyDistance = buddyDistance;
    }

    @JsonProperty("Base Stamina")
    public String getBaseStamina() {
        return baseStamina;
    }

    @JsonProperty("Base Stamina")
    public void setBaseStamina(String baseStamina) {
        this.baseStamina = baseStamina;
    }

    @JsonProperty("Base Attack")
    public String getBaseAttack() {
        return baseAttack;
    }

    @JsonProperty("Base Attack")
    public void setBaseAttack(String baseAttack) {
        this.baseAttack = baseAttack;
    }

    @JsonProperty("Base Defense")
    public String getBaseDefense() {
        return baseDefense;
    }

    @JsonProperty("Base Defense")
    public void setBaseDefense(String baseDefense) {
        this.baseDefense = baseDefense;
    }

    @JsonProperty("Base Flee Rate")
    public String getBaseFleeRate() {
        return baseFleeRate;
    }

    @JsonProperty("Base Flee Rate")
    public void setBaseFleeRate(String baseFleeRate) {
        this.baseFleeRate = baseFleeRate;
    }

    @JsonProperty("Next Evolution Requirements")
    public NextEvolutionRequirements getNextEvolutionRequirements() {
        return nextEvolutionRequirements;
    }

    @JsonProperty("Next Evolution Requirements")
    public void setNextEvolutionRequirements(NextEvolutionRequirements nextEvolutionRequirements) {
        this.nextEvolutionRequirements = nextEvolutionRequirements;
    }

    @JsonProperty("Next evolution(s)")
    public List<NextEvolutionS> getNextEvolutionS() {
        return nextEvolutionS;
    }

    @JsonProperty("Next evolution(s)")
    public void setNextEvolutionS(List<NextEvolutionS> nextEvolutionS) {
        this.nextEvolutionS = nextEvolutionS;
    }

    @JsonProperty("MaxCP")
    public Integer getMaxCP() {
        return maxCP;
    }

    @JsonProperty("MaxCP")
    public void setMaxCP(Integer maxCP) {
        this.maxCP = maxCP;
    }

    @JsonProperty("MaxHP")
    public Integer getMaxHP() {
        return maxHP;
    }

    @JsonProperty("MaxHP")
    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
