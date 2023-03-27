package homeworks;

    public abstract class Member {

        protected String name;
        protected int age;
        protected String phoneNumber;
        protected String address;
        protected int salary;

        //Constructor to replace four setter methods
        public Member(String name, int age, String phoneNumber, String address, int salary) {
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
        }

        //one abstract method:
        public abstract void printSalary();
    }

