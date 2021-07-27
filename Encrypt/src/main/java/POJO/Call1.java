package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Call1 {

    private String Data;
    private String ValueSha1;


    public Call1(String Value){
        this.ValueSha1 = Value;
    }

    public Call1(){}

    @JsonProperty
    public String getData() {
        return Data;
    }
    @JsonProperty
    public void setData(String data) {
        Data = data;
    }
    @JsonProperty
    public String getValueSha1() {
        return ValueSha1;
    }
    @JsonProperty
    public void setValueSha1(String valueSha1) {
        ValueSha1 = valueSha1;
    }

}
