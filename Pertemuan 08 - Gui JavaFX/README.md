[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RJ49mJDZ)
# 🧾 Tugas Pemrograman Berorientasi Objek (PBO)
## Pertemuan 8
### Materi: Implementasi OOP pada GUI (JavaFX/Swing)

---

### 👤 Identitas
**Nama: Inna Lutfiah Fatih**  
**NPM: 4524210044**  
**Pertemuan:** 8  
**GUI: JavaFX**
---

## 🎯 Tujuan Pembelajaran
Pada pertemuan ini, kalian akan belajar dan memahami:

1. Menerapkan konsep OOP (class, objek, inheritance, encapsulation) ke dalam aplikasi GUI.
2. Mengenal dua teknologi GUI di Java, yaitu Swing dan JavaFX.
3. Membuat program CRUD (Create, Read, Update, Delete) sederhana menggunakan array data sebagai penyimpanan sementara.
4. Memahami struktur project Java yang memisahkan package logika dan package UI.

---

## Step by Step Running Project
Bagian ini menjelaskan cara menjalankan project Java berbasis OOP + GUI (JavaFX/Swing) menggunakan Maven di Windows.
Ikuti step ini dari atas ke bawah tanpa skip satupun.

### 🧩 1️⃣ Clone Repository
Pastikan kamu sudah punya Git.
Buka terminal (PowerShell / CMD) dan jalankan perintah:
```php
git clone <URL_REPOSITORY_KAMU>
cd <folder-repo>
```
### 🧱 3️⃣ Instalasi Apache Maven
1. Buka situs resmi Maven:
👉 https://maven.apache.org/download.cgi

2. Scroll ke bagian Binary zip archive dan unduh:
```php
apache-maven-3.9.x-bin.zip
```

3. Ekstrak file zip ke folder permanen, misalnya:
```php
C:\Program Files\Java\apache-maven-3.9.9
```

4. Tambahkan PATH:
- Buka kembali Environment Variables
- Di bagian bawah (System variables), cari Path
- Klik **Edit**
- Klik **New**
- Tambahkan:
```php
C:\Program Files\Java\apache-maven-3.9.9\bin
```

5. Tambahkan juga environment variable baru untuk Maven home:
- Klik New…
- Nama: **MAVEN_HOME**
- Nilai: **C:\Program Files\Java\apache-maven-3.9.9**

6. Klik OK semuanya → tutup → buka ulang terminal.

7. Tes maven di terminal:
```php
mvn -v
```

✅ Kalau muncul:
```php
Apache Maven 3.9.x
Maven home: C:\Program Files\Apache\Maven
Java version: 17.0.x
```
➡️ Berarti Maven sudah siap digunakan.

### 🧰 4️⃣ Jalankan Project JavaFX/Swing
Jalankan perintah ini satu persatu:
```php
mvn clean compile
mvn package
```

lalu, cek di pom.xml dan lihat konfigurasi ini:
```php
<executions>
  <execution>
    <id>run-javafx</id>
    <configuration>
      <mainClass>com.pertemuan8.javafx.Main</mainClass>
    </configuration>
  </execution>
  <execution>
    <id>run-swing</id>
    <configuration>
      <mainClass>com.pertemuan8.javaswing.Main</mainClass>
    </configuration>
  </execution>
  <execution>
    <id>run-mix</id>
    <configuration>
      <mainClass>com.pertemuan8.mix.Main</mainClass>
    </configuration>
  </execution>
</executions>
```
Kamu bisa menjalankan sesuai ID-nya:
```php
mvn javafx:run@run-javafx
mvn javafx:run@run-swing
mvn javafx:run@run-mix
mvn javafx:run@run-main //nambah contoh
```

## 🧠 TUGAS 👩‍💻💻

**Buat 1 Package Baru** dengan **tema bebas sesuai ide kalian sendiri.**  
Simpan dalam **package baru** (misalnya: `com.pertemuan8.crudapp`).
Program bisa melakukan
   - Input Data
   - Hapus Data
   - Lihat Data
   - Edit Data

### Struktur foldernya seperti ini (boleh di ubah menyesuaikan tema)
```php
src/
└── com/
    └── pertemuan8/
        └── crudapp/
            └── Main.java
```

## Hasil Running
<img width="659" height="611" alt="image" src="https://github.com/user-attachments/assets/6aff5ad1-f50c-47dd-a2bd-25a8d8c26830" />





