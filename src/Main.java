public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "0539", "TRH");
        Teacher t2 = new Teacher("Graham","0532","FZK");
        Teacher t3 = new Teacher("Kulyutmaz","0555","BIO");


        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("inek saban","123","4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Tulum Hayri","124","4",tarih,fizik,biyo);
        s2.addBulkExamNote(41,13,50);
        s2.isPass();

        Student s3 = new Student("Guduk","125","4",tarih,fizik,biyo);
        s3.addBulkExamNote(87,78,65);
        s3.isPass();
    }
}
