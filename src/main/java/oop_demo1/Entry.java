package oop_demo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
	public static void main(String[] args) throws IOException {
		ArrayList<Contact> lstContacts = new ArrayList<Contact>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Them");
			System.out.println("2. Xoa");
			System.out.println("3. Chinh sua");
			System.out.println("4. Xem");
			System.out.println("5. In danh sach");
			System.out.println("0. Thoat");

			int query;
			do {
				System.out.println("Nhap lua chon cua ban: ");
				query = sc.nextInt();
				if (query < 0 || query > 5) {
					System.out.println("Lua chon khong hop le!");
					System.out.println("Vui long kiem tra lai.");
				}
			} while (query < 0 || query > 5);

			Long id;
			String name;
			String phone;

			switch (query) {
			case 1: {
				System.out.println("Nhap id: ");
				id = sc.nextLong();
				sc.nextLine();
				System.out.println("Nhap ten: ");
				name = sc.nextLine();
				System.out.println("Nhap sdt: ");
				phone = sc.next();

				lstContacts.add(new Contact(id, name, phone));
				System.out.println("Them thanh cong!");
				System.in.read();
			}
				break;
			case 2: {
				System.out.println("Nhap id muon xoa: ");
				id = sc.nextLong();

				for (Contact item : lstContacts) {
					if (id.equals(item.getId())) {
						lstContacts.remove(item);
						System.out.println("Xoa thanh cong!");
						System.in.read();
						break;
					}
				}
				System.out.println("Khong tim thay id phu hop!");
				System.in.read();
			}
				break;
			case 3: {
				System.out.println("Nhap id can chinh sua thong tin: ");
				id = sc.nextLong();

				for (Contact item : lstContacts) {
					if (id.equals(item.getId())) {
						item.display();
						System.out.println();
						
						while (true) {
							System.out.println("Ban can sua: ");
							System.out.println("1. Ten");
							System.out.println("2. So dien thoai");
							System.out.println("0. Thoa");

							int q;
							do {
								System.out.println("Nhap lua chon cua ban: ");
								q = sc.nextInt();

								if (q < 0 || q > 2) {
									System.out.println("Lua chon khong hop le!");
								}
							} while (q < 0 || q > 2);

							if (q == 1) {
								System.out.println("Nhap ten moi: ");
								name = sc.nextLine();
								item.setName(name);
								System.out.println("Chinh sua thanh cong");
							} else if (q == 2) {
								System.out.println("Nhap so dien thoai moi: ");
								phone = sc.next();
								item.setPhone(phone);
								System.out.println("Chinh sua thanh cong");
							} else {
								System.out.println("Thoat");
								break;
							}
						}
						System.in.read();
					}
				}
				System.out.println("Khong tim thay id phu hop!");
				System.in.read();
			}
				break;
			case 4: {
				System.out.println("Nhap id muon xoa: ");
				id = sc.nextLong();

				for (Contact item : lstContacts) {
					if (id.equals(item.getId())) {
						System.out.println("Ket qua tim kiem");
						item.display();
						
						System.in.read();
						break;
					}
				}
				System.out.println("Khong tim thay id phu hop!");
				System.in.read();
			}
				break;
			case 5:
				for (Contact item : lstContacts) {
					item.display();
				}
				System.in.read();
				break;
			case 0:
				System.out.println("THOAT CHUONG TRINH");
				return;
			}
		}

	}
}
