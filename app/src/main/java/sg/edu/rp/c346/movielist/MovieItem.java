package sg.edu.rp.c346.movielist;

/**
 * Created by 16022603 on 17/7/2017.
 */

public class MovieItem {
        private String title;
        private String description;
        private String author;

        public MovieItem(String title, String description, String author) {
            this.title = title;
            this.description = description;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "MovieItem{" +
                    "title='" + title + '\'' +
                    ", description=" + description +
                    ", author="+ author +
                    '}';
        }
}
