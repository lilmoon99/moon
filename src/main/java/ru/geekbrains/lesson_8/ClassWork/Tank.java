package ru.geekbrains.lesson_8.ClassWork;

public class Tank implements Moving,Attacking {
    private String title;

    public Tank(String name) {
        this.title = name;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    @Override
    public void move() {
        System.out.printf("Tank %s is riding on tracks.\n",this.title);
    }

    @Override
    public void move(int length) {
        System.out.printf("Tank %s rode for %d metres.\n",this.title,length);
    }

    @Override
    public void attack() {
        System.out.printf("Tank %s fires with bomb.\n",this.title);
    }
    static class NestedClass{
        private String field;

        public NestedClass(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return "NestedClass{" +
                    "field='" + field + '\'' +
                    '}';
        }
    }
}
