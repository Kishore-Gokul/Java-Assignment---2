class code14{
    public static void main(String arh[]){
        StringBuffer sb6 = new StringBuffer();
        System.out.println(sb6.capacity());
        sb6.append("Hello");
        System.out.println(sb6.capacity());
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity());
        sb6.ensureCapacity(10);
        System.out.println(sb6.capacity());
        sb6.ensureCapacity(50);
        System.out.println(sb6.capacity());
}
}