# Rotten Potatoes (310-2205 วิศวกรรมซอฟต์แวร์ 2/2569)

Template repository for Lab L1 (310-2205 Software Engineering, semester 2/2569).

![ci](https://github.com/<you>/<repo>/actions/workflows/ci.yml/badge.svg)

แก้ `<you>/<repo>` ในบรรทัดบนเป็นชื่อ GitHub และชื่อ repository ของคุณ
(Replace `<you>/<repo>` above with your GitHub user and repository name.)

## เริ่มที่นี่ (Start here)

1. เข้าสู่ระบบ GitHub แล้วกดปุ่ม **Use this template** ด้านขวาบน เลือก **Create a new repository**
2. Owner = บัญชีของคุณ, Repository name = `rottenpotatoes-<รหัสนักศึกษา>`, Public, ไม่ติ๊ก Include all branches แล้วกด **Create repository from template**
3. เปิด IntelliJ IDEA กด **Clone Repository**, เลือก GitHub ด้านซ้าย, เลือก repository ใหม่ของคุณ, กด Clone แล้วกด **Trust Project**
4. เปิด Terminal ใน IntelliJ แล้วรัน `./mvnw -B verify` (Windows: `mvnw.cmd -B verify`) ต้องจบด้วย `BUILD SUCCESS`
5. ทำ Lab L1 ตามสไลด์ แล้วกรอก `docs/L1.md`

(Sign in, use this template to create `rottenpotatoes-<student id>` under your own account, clone it in IntelliJ IDEA, run `./mvnw -B verify`, then follow the L1 slides.)

## วิธี build

How to build. Requires JDK 25 (check with `java -version`).

```bash
./mvnw -B verify      # macOS / Linux
mvnw.cmd -B verify    # Windows
```

## โครงสร้าง

Project structure.

```
.devcontainer/devcontainer.json   ตั้งค่า Dev Container / Codespaces (JDK 25)
.github/workflows/ci.yml          CI: build + test + coverage ทุกครั้งที่ push
.mvn/wrapper/, mvnw, mvnw.cmd     Maven Wrapper (ไม่ต้องติดตั้ง Maven เอง)
docs/L1.md                        lab passport ของ L1 ที่ต้องกรอก
docs/AI_LOG.md                    บันทึกการใช้ AI
pom.xml                           ไฟล์ build: Java 25, Spring Boot 4.1.2, JaCoCo, Checkstyle
src/main/java/.../Greeting.java   class ตัวอย่างให้ build เขียวตั้งแต่วันแรก
src/test/java/.../GreetingTest.java  test ตัวอย่าง (JUnit 6 + AssertJ)
```

## L1 checklist

Lab L1 checklist.

- [ ] build เขียว: `./mvnw -B verify` ผ่านบนเครื่องของคุณ (build is green)
- [ ] commit แดง: เพิ่ม `FizzBuzzTest` แล้ว commit ตอนที่ test ยังไม่ผ่าน (red commit)
- [ ] commit เขียว: เขียน `FizzBuzz` ให้ test ผ่าน แล้ว commit (green commit)
- [ ] push แล้ว CI เขียวบน GitHub (push and CI is green)
- [ ] กรอก `docs/L1.md` ครบ (lab passport filled in)

## ที่มาของเครื่องมือ

Where the tools come from. ทุกรายการดาวน์โหลดจากผู้พัฒนาโดยตรงผ่าน HTTPS (checked 6 Nov 2026).

| เครื่องมือ (tool) | ผู้ดูแล (maintainer) | แหล่ง (source) |
|---|---|---|
| JDK 25 Eclipse Temurin | Eclipse Adoptium | adoptium.net; Windows `winget install EclipseAdoptium.Temurin.25.JDK`; macOS `brew install --cask temurin@25` |
| Git | Git project, Git for Windows | git-scm.com (macOS: Xcode Command Line Tools) |
| IntelliJ IDEA (free, unified since 2025.3) | JetBrains | jetbrains.com/idea |
| Apache Maven 3.9.11 | Apache Software Foundation | `mvnw` downloads it from repo.maven.apache.org and checks the SHA-256 pinned in `.mvn/wrapper/maven-wrapper.properties` |
| Spring Boot 4.1.2, JUnit 6.0.3, AssertJ 3.27.7, Mockito 5.23.0, JaCoCo 0.8.14, maven-checkstyle-plugin 3.6.0 | Spring team (Broadcom), JUnit, AssertJ, Mockito, EclEmma, Apache Maven, Checkstyle | Maven Central, versions from the Spring Boot BOM (`./mvnw dependency:tree`) |
| GitHub Actions `actions/checkout@v7`, `actions/setup-java@v6`, `actions/upload-artifact@v7` | GitHub | github.com/actions |
| Dev container `mcr.microsoft.com/devcontainers/java:25`; VS Code extensions Extension Pack for Java (Microsoft), Spring Boot Tools (VMware), Cucumber (Cucumber) | Microsoft, VMware, Cucumber | mcr.microsoft.com, marketplace.visualstudio.com |

ถ้าเพิ่ม dependency ใหม่ ให้ตรวจผู้ดูแลและแหล่งแบบเดียวกัน แล้วบันทึกใน `docs/L1.md` (Before adding a dependency, check its maintainer and source the same way and record it.)

## นโยบาย AI ขั้น R0

AI policy, level R0: ถามให้ AI อธิบายได้ แต่ห้ามวางcode หรือ test ที่ AI เขียนให้ และให้เขียนบรรทัด `AI used for: … / none` ใน `docs/L1.md`
(Ask AI to explain, never paste AI-written code or tests; record it in the `AI used for:` line.)
