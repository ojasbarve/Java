class GarbageCollectionDemo01 {

    public static void main(String[] args) {
        GarbageCollectionDemo01 obj = new GarbageCollectionDemo01();

        obj = null; 
        System.gc();  
    }
}