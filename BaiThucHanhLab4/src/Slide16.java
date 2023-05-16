public static void main(String[] args) {
    ArratList<String> arrListString  = new ArratList<>();
    
    arrListString.add("JAVA");
    arrListString.add("PHP");
    arrListString.add("C#");
    arrListString.add("C++");

    System.out.println("Các phần tử có tring arrListString là: ");
    for (int i = 0; i < arrListString.size(); i++) {
        System.out.println(arrListString.get(i) + "\t");
    }
}