from fpdf import FPDF

def clean_text(text):
    return text.encode('latin-1', 'replace').decode('latin-1')

class PDF(FPDF):
    def header(self):
        self.set_font("Arial", "B", 16)
        self.set_text_color(40, 40, 120)
        self.cell(0, 10, clean_text("SnapCart Developer Setup Guide"), ln=True, align="C")
        self.ln(5)
        self.set_draw_color(200, 200, 200)
        self.line(10, self.get_y(), 200, self.get_y())
        self.ln(5)

    def chapter_title(self, title):
        self.set_font("Arial", "B", 13)
        self.set_fill_color(230, 230, 250)
        self.set_text_color(50, 50, 100)
        self.cell(0, 10, clean_text(title), ln=True, fill=True)
        self.ln(2)

    def chapter_body(self, body):
        self.set_font("Courier", "", 10)
        self.set_text_color(30, 30, 30)
        self.multi_cell(0, 6, clean_text(body))
        self.ln(4)

pdf = PDF()
pdf.set_auto_page_break(auto=True, margin=15)
pdf.add_page()

sections = [
    ("📁 Project Structure Overview", """
snapcart/
|-- Dockerfile              # Spring Boot app Docker build
|-- docker-compose.yml      # Runs app + Postgres
|-- deploy.sh               # Deployment script for server
|-- .env                    # Environment variables
|-- pom.xml                 # Spring Boot backend
|-- snapcart_ui/            # Angular frontend
|   |-- package.json
|   `-- ...
`-- src/                    # Spring Boot source code
    """),

    ("🛠 1. Prerequisites", """
On Windows:
- Java 17+
- Node.js (v18.19+)
- Angular CLI (v19+) via: npm install -g @angular/cli
- PostgreSQL (optional, for local DB)
- Docker Desktop with WSL2 backend
- Maven 3.8+
- Git

On Linux:
sudo apt install openjdk-17-jdk maven nodejs npm docker.io docker-compose git
sudo npm install -g @angular/cli
    """),

    ("🚀 2. Backend Setup (Spring Boot)", """
cd snapcart
mvn clean install
    """),

    ("💻 3. Frontend Setup (Angular)", """
cd snapcart/snapcart_ui
npm install
ng serve

UI at: http://localhost:4200
    """),

    ("🐳 4. Docker-Based Setup (App + Postgres)", """
Build and run:
docker compose up --build

App: http://localhost:8080
Postgres: db:5432

.env file:
POSTGRES_DB=snapcart
POSTGRES_USER=snapuser
POSTGRES_PASSWORD=snappass

SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/snapcart
SPRING_DATASOURCE_USERNAME=snapuser
SPRING_DATASOURCE_PASSWORD=snappass
    """),

    ("🌐 5. Deploying to AWS/Remote Machine", """
scp -r snapcart/ ubuntu@<EC2-IP>:/home/ubuntu/
cd snapcart
chmod +x deploy.sh
./deploy.sh
    """),

    ("🧪 6. Testing", """
Backend:
mvn test

Frontend:
ng test
    """),

    ("🔗 Helpful Links", """
- Spring Boot: https://docs.spring.io/spring-boot/docs/current/reference/html/
- Angular: https://angular.io/docs
- Docker Compose: https://docs.docker.com/compose/
- PostgreSQL: https://www.postgresql.org/docs/
    """)
]

for title, body in sections:
    pdf.chapter_title(title)
    pdf.chapter_body(body)

pdf.output("SnapCart_Developer_Setup_Guide.pdf")
