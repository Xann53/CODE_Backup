public class Operations {
    Directory head;
    Directory end;
    Directory tempHead;
    Directory tempEnd;
    Operations () {
        head = null;
        end = null;
        tempHead = null;
        tempEnd = null;
    }
    public void input (String name, String contact) {
        if(isEmpty()) {
            head = new Directory (name, contact, head);
            end = head;
        } else {
            end.link = new Directory (name, contact, end.link);
            end = end.link;
        }
        System.out.println("Remarks: New contact has been added.");
    }
    public void tempInput (String name, String contact) {
        if(tempIsEmpty()) {
            tempHead = new Directory (name, contact, tempHead);
            tempEnd = tempHead;
        } else
            tempHead = new Directory (name, contact, tempHead);
    }
    public void reinput (String name, String contact) {
        if(isEmpty()) {
            head = new Directory (name, contact, head);
            end = head;
        } else
            head = new Directory (name, contact, head);
    }
    public void delete (String name){
        String tempName="", tempContact="";
        if (isEmpty())
            invalid();
        else { 
            for(Directory temp = head; temp!=null; temp=temp.link) {
                if(!(temp.name.equals(name))) {
                    tempName = temp.name;
                    tempContact = temp.contact;
                }
                if(!(tempName.equals("")) && !(tempContact.equals("")))
                    tempInput(tempName, tempContact);
                tempName = "";
                tempContact = "";
            }
            replace();
            System.out.println("Remarks: " + name + " has been removed.");
        }
    }
    public void replace () {
        String tempName="", tempContact="";
        head = null;
        end = null;
        for(Directory temp = tempHead; temp!=null; temp=temp.link) {
            tempName = temp.name;
            tempContact = temp.contact;
            reinput(tempName, tempContact);
            tempName = "";
            tempContact = "";
        }
        tempHead = null;
        tempEnd = null;
    }
    public void viewAll () {
        int ctr = 0;
        boolean proceed;
        String contacts;
        String[] occurrence = new String[directoryCTR(ctr)];
        ctr = 0;
        System.out.println ("Phonebook Directory:");
        for(Directory temp1=head; temp1!=null; temp1=temp1.link) {
            contacts = "";
            proceed = true;
            for(int i=0; i<occurrence.length; i++)
                if(temp1.name.equalsIgnoreCase(occurrence[i]))
                    proceed = false;
            occurrence[ctr] = temp1.name;
            if(proceed)
                System.out.print(temp1.name + " - ");
            for(Directory temp2=head; temp2!=null && proceed; temp2=temp2.link)
                if(temp1.name.equalsIgnoreCase(temp2.name))
                    contacts = contacts + temp2.contact + " ";
            contacts = contacts.trim().replaceAll("\\s", ", ");
            if(proceed)
                System.out.print(contacts + "\n");
            ctr++;
        }
    }
    public int directoryCTR (int ctr) {
        for (Directory temp=head; temp!=null; temp=temp.link)
            ctr++;
        return ctr;
    }
    public void viewContacts (String name) {
        String tempOutput = "";
        String output = "";
        System.out.print("Contact Numbers: ");
        for (Directory temp=head; temp!=null; temp=temp.link)
            if (name.equals(temp.name))
                tempOutput = tempOutput + " " + temp.contact;
        output = tempOutput.trim();
        output = output.replaceAll("\\s", ", ");
        System.out.print(output + "\n");
    }
    public void modify (String val1, String val2, String val3) {
        boolean found = false;
        boolean remarks = false;
        if(ifNumbers(val1) && ifNumbers(val2)) {
            for(Directory temp=head; temp!=null; temp=temp.link)
                if (temp.contact.equals(val1)) {
                    temp.contact = val2;
                    remarks = true;
                }
            if(remarks) {
                message(val1);
                found = true;
            }
        }
        if(ifLetters(val1) && ifLetters(val2) && val3.equals("")) {
            for(Directory temp=head; temp!=null; temp=temp.link)
                if (temp.name.equalsIgnoreCase(val1)) {
                    temp.name = val2;
                    remarks = true;
                }
            if(remarks) {
                message(val1);
                found = true;
            }
        } else if(ifLetters(val1) && ifNumbers(val2) && val3.equals("")) {
            found = false;
        } else if(ifLetters(val1) && ifNumbers(val2) && ifNumbers(val3)) {
            for(Directory temp=head; temp!=null; temp=temp.link)
                if (temp.name.equalsIgnoreCase(val1) && temp.contact.equals(val2)) {
                    temp.contact = val3;
                    remarks = true;
                }
            if(remarks) {
                message(val1);
                found = true;
            }
        }
        if(!found)
            invalid();
    }
    public boolean ifLetters (String value) {
        for(int i=0; i<value.length(); i++) {
            if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {}
            else
                return false;
        }
        return true;
    }
    public boolean ifNumbers (String value) {
        for(int i=0; i<value.length(); i++) {
            if(value.charAt(i) >= '0' && value.charAt(i) <= '9') {}
            else
                return false;
        }
        return true;
    }
    public void message (String val1) {
        System.out.println("Remarks: " + val1 + " has been modified.");
    }
    public boolean isEmpty () {
        return (head == null);
    }
    public boolean tempIsEmpty () {
        return (tempHead == null);
    }
    public void invalid() {
        System.out.println("Remarks: Invalid command");
    }
}