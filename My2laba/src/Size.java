public enum Size {
    SINGLE(90, 200),
    DOUBLE(180, 210),
    KING(100, 210),
    CHILD(120, 210);

    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    Size(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public String getAllsize() {
        return name() + " " + width + " " + length;
    }

    public static Size getValue(String key) {
        switch(key){
            case "SINGLE":
            {
                return SINGLE;
            }
            case "DOUBLE":
            {
                return DOUBLE;
            }
            case "KING":
            {
                return KING;
            }
            case "CHILD":
            {
                return CHILD;
            }
            default:
            {
                return SINGLE;
            }
        }
    }

//    A1("Односпальная кровать"),
//    A2("Двухспальная кровать"),
//    A3("Детская"),
//    A4("Двухэтажная кровать"),
//    A5("Кровать с подогревом");
//
//    public final String size;
//
//    Size(String a){ size = a; }
//
//    public String pricePrint() {
//            if (this.size == "Односпальная кровать")
//                return "210x240";
//            if (this.size == "Двухспальная кровать")
//                return "350x380";
//            if (this.size == "Детская")
//                return "600x700";
//            if (this.size == "Двухэтажная кровать")
//                return "210x350";
//            if (this.size == "Кровать с подогревом")
//                return "500x520";
//            return "";
//    }
}
