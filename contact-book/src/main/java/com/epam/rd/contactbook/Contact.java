package com.epam.rd.contactbook;

import java.util.Arrays;

public class Contact {
    private String contactName;
    private ContactInfo[] contactInfos = new ContactInfo[10];

    public Contact(String contactName) {
        this.contactName = contactName;
        contactInfos[0] = new NameContactInfo();
    }

    public static class Email implements ContactInfo {
        private String localPart;
        private String domain;

        private Email(String localPart, String domain) {
            this.localPart = localPart;
            this.domain = domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return localPart + "@" + domain;
        }
    }

    public static class Social implements ContactInfo {
        private String title;
        private String id;

        private Social(String title, String id) {
            this.title = title;
            this.id = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return id;
        }
    }

    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return contactName;
        }
    }

    public void rename(String newName) {
        if (newName != null && newName.length() > 0) {
            contactName = newName;
        }
    }

    public Email addEmail(String localPart, String domain) {
        for(int i = 2; i < 5; i++) {
            if (contactInfos[i] == null) {
                Email email = new Email(localPart, domain);
                contactInfos[i] = email;
                return email;
            }
        }
        return null;
    }


    public Email addEpamEmail(String firstname, String lastname) {
        for(int i = 2; i < 5; i++) {
            if (contactInfos[i] == null) {
                Email email = new Email(firstname + "_" + lastname, "epam.com") {
                    public String getTitle() {
                        return "Epam Email";
                    }
                };
                contactInfos[i] = email;
                return email;
            }
        }
        return null;
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if(contactInfos[1] == null) {
            ContactInfo phoneNumber = new ContactInfo() {
                @Override
                public String getTitle() {
                    return "Tel";
                }

                @Override
                public String getValue() {
                    return "+" + code + " " + number;
                }
            };
            contactInfos[1] = phoneNumber;
            return phoneNumber;
        }
        else {
            return null;
        }
    }

    public Social addTwitter(String twitterId) {
        for(int i = 5; i < 10; i++) {
            if(contactInfos[i] == null) {
                Social social = new Social("Twitter", twitterId);
                contactInfos[i] = social;
                return social;
            }
        }
        return null;
    }

    public Social addInstagram(String instagramId) {
        for(int i = 5; i < 10; i++) {
            if(contactInfos[i] == null) {
                Social social = new Social("Instagram", instagramId);
                contactInfos[i] = social;
                return social;
            }
        }
        return null;
    }

    public Social addSocialMedia(String title, String id) {
        for(int i = 5; i < 10; i++) {
            if(contactInfos[i] == null) {
                Social social = new Social(title, id);
                contactInfos[i] = social;
                return social;
            }
        }
        return null;
    }

    public ContactInfo[] getInfo() {
        int notNullValuesAmount = 0;
        for (ContactInfo contactInfo : contactInfos) {
            if(contactInfo != null) {
                notNullValuesAmount++;
            }
        }
        ContactInfo[] notNullContactInfos = new ContactInfo[notNullValuesAmount];
        int positionInArray = 0;
        for (ContactInfo contactInfo : contactInfos) {
            if(contactInfo != null) {
                notNullContactInfos[positionInArray] = contactInfo;
                positionInArray++;
            }
        }
        return notNullContactInfos;
    }

}
