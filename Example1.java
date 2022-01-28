
    interface Father {

        float HT = 6.2f;
        void Height();
    }

    interface Mother {

        float HT = 5.8f;
        void Height();

    }

    class Child implements Father, Mother {
        public void Height() {

            Float ht = (Father.HT + Mother.HT) /2;
            System.out.println("Child Height :" +ht);


        }

    }

    class Multi {

        public static void main(String[] args) {
            Child ch = new Child();
            ch.Height();
        }
    }