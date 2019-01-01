package chapter07.ch7_190101;

interface Parseable {
    //구문 분석작업을 수행한다.
    public abstract void parse (String fileName);
}

//getParser매서드는 매개변수로 받은 type에 따라 XMLParser인스턴스 또는 HTMLParser인스턴스를 반환
class ParserManager {
    //리턴타입이 Parseable인터페이스이다.
    public static Parseable getParser(String type) {
        if(type.equals("XML")){
            return new XMLParser(); //main매소드의 parse참조변수의 XHMLParser의 주소값이 return
        }else{
            //Parseable p = new HTMLParser();
            //return p;
            return new HTMLParser();
        }
    }
}

//Parseable인터페이스를 구현한 XMLParser클래스
class XMLParser implements Parseable {
    public void parse(String fileName) {
        //구문 분석작업을 수행하는 코드를 적는다.
        System.out.println(fileName + "- XML parsing completed");
    }
}

//Parseable인터페이스를 구현한 HTMLParser클래스
class HTMLParser implements Parseable {
    public void parse(String fileName) {
        //구문 분석작업을 수행하는 코드를 적는다.
        System.out.println(fileName + "- HTML parsing completed");
    }
}

class ParserTest {
    public static void main(String[] args) {
        //Parseable parser = ParserManager.getParser("XML"); //parser에 주소값 저장
        Parseable parser = new XMLParser(); // 과 같다.
        parser.parse("document.xml");   //document.xml - XML parsing completed
            //참조변수 parser을 통해 pars() 호출
            //Parser은 XMLParser의 주소값을 갖고 있으므로 XMLParser가 참조하고 있는 인스턴스를 참조한다.
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html"); //document2.html - HTML parsing completed
    }
}

