public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name"+ name +", Age: "+ age);
    }}

    class Student extends Person{
        private String course;

        Student(String name, int age, String course){
            super(name, age);
            this.course = course;
        }
        @Override 
        void display(){
            super.display();
            System.out.println("course"+ course);
        }
    }

    class Teacher extends Person{
        private String subject;

        Teacher(String name, int age, String subject){
            super(name, age);
            this.subject = subject;
        }
        @Override 
        void display(){
            super.display();
            System.out.println("subject"+ subject);
        }


        public class PersonDemo {
            public static void main(String[] args) {
                Person p =  new Person("Ronald", 20);
                Student s = new Student("Tatenda", 19, "Computer Science");
                Teacher t = new Teacher("Mr Munetsi", 40, "Networks");

                p.display();
                s.display();
                t.display();

            }
        }
}
