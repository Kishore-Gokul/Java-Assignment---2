class code7{
    public static void main(String arh[]){
        StringBuffer sb7 = new StringBuffer();
        System.out.println(sb7.capacity());
        sb7.append("Hello");
        System.out.println(sb7.capacity());
        sb7.append("java is my favourite language");
        System.out.println(sb7.capacity());
        sb7.ensureCapacity(10);
        System.out.println(sb7.capacity());
        sb7.ensureCapacity(50);
        System.out.println(sb7.capacity());
}
}
