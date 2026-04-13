# Tugas Praktikum 6 - Deployment Perangkat Lunak (Dockerization)

## 👤 Identitas Mahasiswa
- **Nama:** Nashrul Fikri
- **NIM:** 20230140105
- **Prodi:** Teknologi Informasi
- **Instansi:** Universitas Muhammadiyah Yogyakarta

---

## 🛠️ Tech Stack & Docker Info
- **Backend:** Spring Boot 4.0.3 (Java 25)
- **Frontend:** Thymeleaf & Bootstrap 5
- **Docker Image:** `aestrick/tugas-20230140105:1.0`
- **Classmate Image Pulled:** `spongebarr/tugas-20230140134:1.0`

---

## 📸 Bukti Dokumentasi (10 Screenshots)

### 1. Docker Desktop Evidence
| No | Deskripsi                                                                          | Screenshot |
|----|------------------------------------------------------------------------------------|------------|
| 1 | ![img.png](img.png)**Halaman Images:** Hasil push image sendiri & pull image teman [cite: 690] | ![Docker Images](./img/ss1_images.jpg) |
| 2 | ![img_1.png](img_1.png)**Halaman Container:** Container dari image teman sedang berjalan [cite: 691]      | ![Docker Container](./img/ss2_container.jpg) |

### 2. Website Pribadi (Running via Docker)
| No | Deskripsi | Screenshot |
|----|-----------|------------|
| 3 | ![img_2.png](img_2.png)**Halaman Login:** Username: admin, PW: NIM [cite: 693] | ![My Login](./img/ss3_my_login.jpg) |
| 4 | ![img_3.png](img_3.png)**Halaman Home:** Tampilan awal (Data Kosong) [cite: 694] | ![My Home Empty](./img/ss4_my_home_empty.jpg) |
| 5 | ![img_4.png](img_4.png)**Halaman Form:** Input data mahasiswa baru [cite: 695] | ![My Form](./img/ss5_my_form.jpg) |
| 6 | ![img_5.png](img_5.png)**Halaman Home (Isi):** Tampilan setelah data di-input [cite: 696] | ![My Home Result](./img/ss6_my_home_result.jpg) |

### 3. Website Teman (Pulled Image)
| No | Deskripsi | Screenshot |
|----|-----------|------------|
| 7 | ![img_6.png](img_6.png)**Halaman Login Teman** [cite: 698] | ![Friend Login](./img/ss7_friend_login.jpg) |
| 8 | ![img_7.png](img_7.png)**Halaman Home Teman (Kosong)** [cite: 699] | ![Friend Home Empty](./img/ss8_friend_home_empty.jpg) |
| 9 | ![img_8.png](img_8.png)**Halaman Form Teman** [cite: 700] | ![Friend Form](./img/ss9_friend_form.jpg) |
| 10 | ![img_9.png](img_9.png)**Halaman Home Teman (Isi)** [cite: 701] | ![Friend Home Result](./img/ss10_friend_home_result.jpg) |

---

## 🚀 Cara Menjalankan Image Saya
Untuk menjalankan aplikasi ini, pastikan Docker sudah terpasang, lalu jalankan perintah:
```bash
docker pull aestrick/tugas-20230140105:1.0
docker run -d -p 8080:8080 aestrick/tugas-20230140105:1.0