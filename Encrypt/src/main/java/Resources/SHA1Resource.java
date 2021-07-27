package Resources;


import POJO.Call1;
import com.example.API.EncLogic;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/SHA1Enc")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SHA1Resource {
    public String ValueSha1;
    public SHA1Resource(String ValueSha1){
        this.ValueSha1 = ValueSha1;
    }
    @Path("/Encrypt")
    @POST
    public Call1 Enc(Call1 call){
        final String value1 = call.getData();
        String value2 = EncLogic.SHA1Encrypt(value1);
        call.setValueSha1(value2);
        return call;
    }

}