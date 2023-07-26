## RACHMAT MAULUDDIN
## 202210370311043

# Sistem Kasir
Kasir ini terdapat 2 role yang berbeda yaitu pelanggan dan karyawan. Masing-masing role memiliki username, password dan fitur yang berebeda. 
 + Untuk fitur pelanggan memiliki **MemeberShip**. Membership tersebut dibagi menjadi 3, yaitu Premium, Gold, dan Silver. Masing-masing memiliki potongan yang berbeda. Premium 10%, Gold 7.5%, dan Silver 5%.
 + Untuk fitur karyawan juga memiliki potongan harga yaitu 12.5%

Kasir ini dapat menerapkan sistem Voucher Diskon. Voucher tersebut memiliki rentang tanggal berlaku.


**Untuk menrubah data-data seperti username, password, dll ada di package data lalu pilih class DataDB**

![image](https://github.com/Xzadez/KasirJava/assets/55611402/bda1c3a5-8b4d-42eb-b358-20ca8b483d45)

**Data Username dan Password**

{username, password, role, type_membership}
Type Membership
+ 1 Premium
+ 2 Gold
+ 3 Silver

![image](https://github.com/Xzadez/KasirJava/assets/55611402/d86a744b-50c7-4eea-a1e8-5026c97e87c3)

**Data Barang**

{nama_barang, code_barang, harga_barang, kategori_barang, subcategory, for_sale}

kategori_barang
+ 1 Non Electronic
+ 2 Electronic

![image](https://github.com/Xzadez/KasirJava/assets/55611402/e9737ae7-6c26-43f3-beb0-6c4d0fb19fa8)
