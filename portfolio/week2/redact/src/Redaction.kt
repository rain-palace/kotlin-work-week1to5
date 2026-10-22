// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, text: String, redaction: Char='X'): String {
    if(text.isEmpty()){
        return document
    }
    return document.replace(text,
        redaction.toString().repeat(text.length))
}