# Praktikum 1 App - Pencatatan Stok Yakult Lady

Aplikasi Android sederhana yang dikembangkan menggunakan **Kotlin** dan **Jetpack Compose** sebagai proyek untuk **Praktikum 1**. Aplikasi ini dirancang untuk memudahkan **Yakult Lady** dalam melakukan pencatatan stok dan rekapitulasi setoran.

---

## 📌 Deskripsi Proyek

Aplikasi ini merupakan penyelesaian studi kasus "Perancangan Aplikasi Mobile Pencatatan dan Rekapitulasi Setoran Stok Yakult untuk Yakult Lady". Proyek ini menggunakan arsitektur antarmuka modern berbasis Jetpack Compose, Navigation Compose, Material Design 3, serta mendukung *edge-to-edge layout*.

---

## 📁 Struktur Folder Proyek

Berikut adalah struktur direktori utama dari proyek `Praktikum1App` beserta keterangannya:

```text
Praktikum1App/
├── app/                        # Modul utama aplikasi Android
│   ├── build.gradle.kts        # Konfigurasi build (dependencies, versi SDK) untuk modul app
│   └── src/
│       ├── androidTest/        # Berisi kode untuk Instrumented Testing (tes UI di device)
│       ├── main/               # Kode sumber utama aplikasi
│       │   ├── AndroidManifest.xml # File konfigurasi utama Android (deklarasi aplikasi, permissions)
│       │   ├── java/com/example/praktikum1app/ # Direktori source code Kotlin
│       │   │   ├── MainActivity.kt    # Entry point aplikasi & konfigurasi NavHost (navigasi)
│       │   │   ├── SplashScreen.kt    # UI untuk Splash Screen (jeda 3 detik awal)
│       │   │   ├── DashboardScreen.kt # UI untuk Halaman Utama / Dashboard (Yakult Stock)
│       │   │   └── ui/theme/          # Konfigurasi tema Jetpack Compose (Warna, Tipografi)
│       │   └── res/            # Direktori Resource (sumber daya non-kode)
│       │       ├── drawable/   # File gambar (PNG, SVG) dan resource drawable XML
│       │       │   ├── prak_latihan_1/    # Berisi screenshots hasil pelaksanaan Praktikum Latihan 1
│       │       │   ├── tugas_1/           # Berisi docs PDF dan screenshots untuk Tugas 1
│       │       │   ├── ui/                # Berisi desain mockup UI untuk referensi koding
│       │       │   │   ├── yakult_stock_dashboard.png # Mockup UI Dashboard aplikasi Yakult
│       │       │   │   └── tambah_penerimaan.png      # Mockup UI halaman tambah data
│       │       │   ├── ic_launcher_background.xml
│       │       │   └── ic_launcher_foreground.xml
│       │       ├── mipmap-*/   # Ikon peluncur aplikasi (App Icon) dengan berbagai resolusi
│       │       ├── values/     # File XML untuk nilai statis seperti strings, colors, dan themes klasik
│       │       └── xml/        # File konfigurasi XML tambahan (misal: aturan backup)
│       └── test/               # Berisi kode untuk Unit Testing (tes logika tanpa emulator)
├── build.gradle.kts            # Konfigurasi build level project root
├── gradle/libs.versions.toml   # Katalog versi dependency Gradle (untuk manajemen dependensi terpusat)
├── gradle.properties           # Properti konfigurasi untuk build system Gradle
├── settings.gradle.kts         # Definisi modul dan repositori yang dilibatkan dalam project
└── README.md                   # File dokumentasi project ini
```

---

## 📸 Dokumentasi / Mockup UI (Studi Kasus Yakult)

Gambar mockup yang digunakan sebagai acuan tampilan (tersimpan dalam folder `app/src/main/res/drawable/ui/`):
- `yakult_stock_dashboard.png`
- `tambah_penerimaan.png`

Dokumen studi kasus PDF tersimpan di `app/src/main/res/drawable/tugas_1/docs/`.
Screenshots hasil *run* aplikasi tersimpan di `app/src/main/res/drawable/prak_latihan_1/` dan `app/src/main/res/drawable/tugas_1/screenshots/`.

---

## 🛠️ Spesifikasi & Teknologi

- **Bahasa Pemrograman**: Kotlin
- **UI Framework**: Jetpack Compose (Material3)
- **Navigation**: Jetpack Navigation Compose
- **Minimum SDK**: 28 (Android 9.0 Pie)
- **Target SDK**: 37
- **Build System**: Gradle (Kotlin DSL)

---

## 🚀 Cara Menjalankan Proyek

1. Buka proyek `Praktikum1App` di **Android Studio**.
2. Lakukan Gradle Sync jika diperlukan (`Sync Project with Gradle Files`).
3. Pilih perangkat emulator atau HP fisik.
4. Klik tombol **Run** (`Shift + F10`) atau jalankan perintah Gradle berikut di terminal:
   ```bash
   ./gradlew installDebug
   ```
