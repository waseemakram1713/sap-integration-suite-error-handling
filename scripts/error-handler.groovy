import com.sap.gateway.ip.core.customdev.util.Message;

def Message processData(Message message) {
    def body = message.getBody(java.lang.String);
    // If the incoming JSON/Text contains the word "FAIL", trigger the error
    if(body.contains("FAIL")) {
        throw new Exception("Simulated Processing Error!");
    }
    return message;
}