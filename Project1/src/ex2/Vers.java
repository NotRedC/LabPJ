package ex2;

public class Vers {
        private String vers;

        public Vers(String vers) {
            this.vers = vers;
        }

        public int returnCuvinte(){
            String[] cuvinte = vers.split("\\s");
            return cuvinte.length;
        }

        public int returnVocale()
        {
            String voc = "aeiouAEIOU";
            int nr_voc = 0;
            for(char c : vers.toCharArray())
            {
                if(voc.contains(String.valueOf(c)))
                {
                    nr_voc++;
                }
            }
            return nr_voc;
        }

        public String getVers() {
            return vers;
        }

        public void setVers(String vers) {
            this.vers = vers;
        }
}

