class code13{
    public static void main(String arh[]){
        StringBuffer sb5 = new StringBuffer();
        System.out.println(sb5.capacity());
        sb5.append("Hello");
        System.out.println(sb5.capacity());
        sb5.append("java is my favourite language");
        System.out.println(sb5.capacity());
}
}