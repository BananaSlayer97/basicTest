package comparable;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 03 10:41
 **/
public class User implements Comparable<comparable.User> {

        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User() {
            super();
        }

        @Override
        public int compareTo(comparable.User t) {
            return this.age - t.getAge();
        }
    }

