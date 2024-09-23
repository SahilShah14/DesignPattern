// Abstract Product
interface Document {
    String print();
}

// Concrete Product - PDF
class PDFDocument implements Document {
    @Override
    public String print() {
        return "PDF Document Printed";
    }
}

// Concrete Product - Word
class WordDocument implements Document {
    @Override
    public String print() {
        return "Word Document Printed";
    }
}

// Factory Class
class DocumentFactory {
    public Document createDocument(String docType) {
        if ("pdf".equalsIgnoreCase(docType)) {
            return new PDFDocument();
        } else if ("word".equalsIgnoreCase(docType)) {
            return new WordDocument();
        } else {
            throw new IllegalArgumentException("Unknown document type");
        }
    }
}

// Main class
public class FactoryPattern {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document pdfDoc = factory.createDocument("pdf");
        System.out.println(pdfDoc.print());

        Document wordDoc = factory.createDocument("word");
        System.out.println(wordDoc.print());
    }
}
