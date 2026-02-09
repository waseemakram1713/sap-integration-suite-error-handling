import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;

def Message processData(Message message) {
    // 1. Get the Exception details
    def map = message.getProperties();
    def ex = map.get("CamelExceptionCaught");
    
    // 2. Construct a professional error body
    def errorBody = """
    --------------------------------------------------
    ERROR REPORT: SAP Integration Suite
    --------------------------------------------------
    Timestamp  : ${new Date().toString()}
    Message ID : ${map.get("SAP_MessageProcessingLogID")}
    Error Type : ${ex.getClass().getName()}
    Details    : ${ex.getMessage()}
    --------------------------------------------------
    """;

    message.setBody(errorBody);
    return message;
}