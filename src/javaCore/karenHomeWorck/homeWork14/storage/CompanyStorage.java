package javaCore.karenHomeWorck.homeWork14.storage;

import javaCore.karenHomeWorck.homeWork14.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        } else {
            companies[size++] = company;
        }
    }

    private void extend() {
        Company[] temp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, temp, 0, size);
        companies = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }

    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return company;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}

