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
    public void input (String name, String contact, String contact2, String contact3) {
        boolean found = false, valid = false;
        name = fixName(name);
        if(isEmpty()) {
            head = new Directory (name, contact, head);
            end = head;
            
            if(contact2 != "") { //if there is number 2
                if(ifNumbers(contact2)) {
                    end.link = new Directory (name, contact2, end.link);
                    end = end.link;
                }
                else {
                    invalid();
                    return;
                }
            }
            if(contact3 != "") { //if there is number 3
                if(ifNumbers(contact3)) {
                    end.link = new Directory (name, contact2, end.link);
                    end = end.link;
                }
                else {
                    invalid();
                    return;
                }
            }
        } else {
            if(contactExists(name))
                found = true;
            if(numberLimit(name, contact, contact2, contact3)) { //limits user up to 3 numbers per person
                System.out.println("Remarks: You can only add 3 numbers per contact.");
                return;
            }
            end.link = new Directory (name, contact, end.link);
            end = end.link;
            
            if(contact2 != "") { //if there is number 2
                if(ifNumbers(contact2)) {
                    end.link = new Directory (name, contact2, end.link);
                    end = end.link;
                }
                else {
                    invalid();
                    return;
                }
            }
            if(contact3 != "") { //if there is number 3
                if(ifNumbers(contact3)) {
                    end.link = new Directory (name, contact2, end.link);
                    end = end.link;
                }
                else {
                    invalid();
                    return;
                }
            }
        }
        if(found)
            System.out.println("Remarks: New number has been added.");
        else
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
    public void delete (String name, String contact){
        String tempName="", tempContact="";
        boolean found = false, withNum = false, numFound = false;
        name = fixName(name);
        if (isEmpty())
            invalid();
        else {
            if(contactExists(name)) {
                found = true;
                if(contact != "" && ifNumbers(contact)) {
                    for(Directory temp = head; temp!=null; temp=temp.link) {
                        if(temp.name.equalsIgnoreCase(name) && temp.contact.equals(contact))
                            numFound = true; //check if number is found
                    }
                    if(!numFound) {
                        invalid(); //exit method if number not found
                        return;
                    }
                }
            }
            if(!found) {
                invalid(); //exit method if name not found
                return;
            }
            for(Directory temp = head; temp!=null; temp=temp.link) {
                if(contact != "" && ifNumbers(contact)) { //if there is specific number to be deleted
                    if(temp.name.equalsIgnoreCase(name) && !temp.contact.equals(contact)) { //stores numbers not equal to number to delete
                        tempName = temp.name;
                        tempContact = temp.contact;
                    }
                    withNum = true;
                }
                if(!(temp.name.equalsIgnoreCase(name))) { //stores contact names not equal to the name to be deleted
                    tempName = temp.name;
                    tempContact = temp.contact;
                }
                if(!(tempName.equals("")) && !(tempContact.equals("")))
                    tempInput(tempName, tempContact); //stores to a temp
                tempName = "";
                tempContact = "";
            }
            replace();
            if(withNum)
                System.out.println("Remarks: Contact number has been removed.");
            else
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
        sort();
        if(isEmpty()) {
            System.out.println ("Remarks: Phonebook directory is empty.");
        } else {
            System.out.println ("Phonebook directory:");
            for(Directory temp1=head; temp1!=null; temp1=temp1.link) {
                contacts = "";
                proceed = true;
                for(int i=0; i<occurrence.length; i++) { 
                    if(temp1.name.equalsIgnoreCase(occurrence[i]))
                        proceed = false;
                }
                occurrence[ctr] = temp1.name; 
                if(proceed)
                    System.out.print(temp1.name + " - ");
                for(Directory temp2=head; temp2!=null && proceed; temp2=temp2.link) { 
                    if(temp1.name.equalsIgnoreCase(temp2.name)) 
                        contacts = contacts + temp2.contact + " ";
                }
                contacts = contacts.trim().replaceAll("\\s", ", ");
                if(proceed)
                    System.out.print(contacts + "\n");
                ctr++;
            }
        }
    }
    public int directoryCTR (int ctr) {
        for (Directory temp=head; temp!=null; temp=temp.link)
            ctr++;
        return ctr;
    }
    public void sort () {
        int size = directoryCTR(0);
        for (int i = 0; i < size; i++ ) {
            Directory current = head;
            Directory next = head.link;
            for (int j = 0; j < size - 1; j++) {
                if (current.name.compareTo(next.name) > 0) {
                    String tempName = current.name; //swapping of names
                    current.name = next.name;
                    next.name = tempName;
                    
                    String tempNum = current.contact; //swapping of numbers
                    current.contact = next.contact;
                    next.contact = tempNum; 
                } 
                current = next;
                next = next.link;
            }
        }
    }
    public void viewContacts (String name) {
        String tempOutput = "";
        String output = "";
        boolean found = false;
        
        for (Directory temp=head; temp!=null; temp=temp.link) {
            if (name.equalsIgnoreCase(temp.name)) {
                tempOutput = tempOutput + " " + temp.contact;
                found = true;
            }
        }
        output = tempOutput.trim();
        output = output.replaceAll("\\s", ", ");
        if(found)
            System.out.println("Contact Number(s): " + output);
        else
           invalid(); 
    }
    public void modify (String val1, String val2, String val3) {
        boolean found = false;
        boolean remarks = false;
        val1 = fixName(val1);
        if(ifLetters(val1) && ifLetters(val2) && val3.equals("") && !val1.equalsIgnoreCase(val2)) { //modify name
            val2 = fixName(val2);
            for(Directory temp=head; temp!=null; temp=temp.link) {
                if (temp.name.equalsIgnoreCase(val1)) {
                    temp.name = val2;
                    remarks = true;
                }
            }
            if(remarks) {
                message(val1);
                found = true;
            }
        } else if(ifLetters(val1) && ifNumbers(val2) && val3.equals("") || checkNumber(val3)) {
            found = false;
        } else if(ifLetters(val1) && ifNumbers(val2) && ifNumbers(val3)) { //modify number
            for(Directory temp=head; temp!=null; temp=temp.link) {
                if (temp.name.equalsIgnoreCase(val1) && temp.contact.equals(val2)) {
                    temp.contact = val3;
                    remarks = true;
                }
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
            if(Character.isLetter(value.charAt(i))) {}
            else
                return false;
        }
        return true;
    }
    public boolean ifNumbers (String value) {
        for(int i=0; i<value.length(); i++) {
            if(Character.isDigit(value.charAt(i))) {}
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
        System.out.println("Remarks: Invalid command.");
    }
    public boolean checkNumber(String number) {
        return number.length() != 7 && number.length() != 11;
    }
    public String fixName(String name) {
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        
        return name;
    }
    public boolean contactExists (String name) {
        for(Directory temp = head; temp!=null; temp=temp.link) {  //check if name is on the list
            if(temp.name.equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
    public boolean numberLimit(String name, String contact, String contact2, String contact3) {
        int count = 1; //automatically add 1 for number input

        if(contact2 != "")
            count++;
        if(contact3 != "")
            count++;    
        for(Directory temp=head; temp!=null; temp=temp.link) {
            if(temp.name.equalsIgnoreCase(name))
                count++;
        }
        if(count>3)
            return true;

        return false;
    }
}