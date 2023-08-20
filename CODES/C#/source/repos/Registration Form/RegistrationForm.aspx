<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="RegistrationForm.aspx.cs" Inherits="Registration_Form.RegistrationForm" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 832px;
            border-collapse: collapse;
            height: 408px;
            border: 1px solid #99FF99;
            background-color: #CCFFCC;
            margin-left: 0px;
            position: absolute;
            left: 96px;
            top: 36px;
        }
        .auto-style13 {
            width: 458px;
            border-collapse: collapse;
            height: 53px;
            border: 1px solid #99FF99;
            background-color: #CCFFCC;
            margin-left: 0px;
            position: absolute;
            left: 98px;
            top: 514px;
        }
        .auto-style27 {
            width: 221px;
        }
        .auto-style52 {
            width: 206px;
            height: 64px;
        }
        .auto-style53 {
            width: 277px;
            height: 64px;
        }
        .auto-style54 {
            width: 207px;
            height: 64px;
        }
        .auto-style55 {
            width: 206px;
            height: 65px;
        }
        .auto-style56 {
            width: 277px;
            height: 65px;
        }
        .auto-style57 {
            width: 207px;
            height: 65px;
        }
        .auto-style58 {
            width: 448px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <table align="center" class="auto-style1" style="border: thin solid #FFFFFF; border-collapse: collapse;">
                <tr>
                    <td class="auto-style52" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">Name:</td>
                    <td class="auto-style53" style="padding-left: 5px">
                        <asp:TextBox ID="nameTextBox" runat="server" Width="257px"></asp:TextBox>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="NameRequiredFieldValidator" runat="server" ControlToValidate="nameTextBox" ErrorMessage="Username is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:RequiredFieldValidator>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style52" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">E-mail:</td>
                    <td class="auto-style53" style="padding-left: 5px">
                        <asp:TextBox ID="emailTextBox" runat="server" Width="257px"></asp:TextBox>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="EmailRequiredFieldValidator" runat="server" ControlToValidate="emailTextBox" Display="Dynamic" ErrorMessage="Email is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:RequiredFieldValidator>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style52" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">Gender:</td>
                    <td class="auto-style53" style="padding-left: 5px">
                        <asp:DropDownList ID="genderDropDownList" runat="server" AutoPostBack="True" Height="19px" Width="137px">
                            <asp:ListItem Selected="True">--Select Gender--</asp:ListItem>
                            <asp:ListItem>Male</asp:ListItem>
                            <asp:ListItem>Female</asp:ListItem>
                        </asp:DropDownList>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="GenderRequiredFieldValidator" runat="server" ControlToValidate="genderDropDownList" ErrorMessage="Select a Gender!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300" InitialValue="--Select Gender--"></asp:RequiredFieldValidator>
                    </td>
                    <td class="auto-style54" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style55" style="text-align: right; font-family: Arial; font-style: italic;">Birthday:</td>
                    <td class="auto-style56" style="padding-left: 5px">
                        <asp:TextBox ID="bDayTextBox" runat="server" Width="257px" TextMode="DateTime"></asp:TextBox>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="BirthdayRequiredFieldValidator" runat="server" ControlToValidate="bDayTextBox" ErrorMessage="Birthday is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:RequiredFieldValidator>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style55" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">Age:</td>
                    <td class="auto-style56" style="padding-left: 5px">
                        <asp:TextBox ID="ageTextBox" runat="server" Width="77px"></asp:TextBox>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="AgeRequiredFieldValidator" runat="server" ControlToValidate="ageTextBox" ErrorMessage="Age is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300" Display="Dynamic"></asp:RequiredFieldValidator>
                        <asp:RangeValidator ID="AgeCompareValidator" runat="server" ControlToValidate="ageTextBox" ErrorMessage="Age must be  18 to 50, inclusive" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300" MaximumValue="50" MinimumValue="18" Type="Integer"></asp:RangeValidator>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style55" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">Password:</td>
                    <td class="auto-style56" style="padding-left: 5px">
                        <asp:TextBox ID="password1TextBox" runat="server" Width="257px" TextMode="Password"></asp:TextBox>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="PasswordRequiredFieldValidator" runat="server" ControlToValidate="password1TextBox" ErrorMessage="Password is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:RequiredFieldValidator>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style55" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">Confirm Password:</td>
                    <td class="auto-style56" style="padding-left: 5px">
                        <asp:TextBox ID="password2TextBox" runat="server" Width="257px" TextMode="Password"></asp:TextBox>
                    </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid; vertical-align: middle;">
                        <asp:RequiredFieldValidator ID="ConfirmPasswordRequiredFieldValidator" runat="server" ControlToValidate="password2TextBox" ErrorMessage="Confirm Password is Required!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:RequiredFieldValidator>
                        <asp:CompareValidator ID="CompareValidator" runat="server" ControlToCompare="password1TextBox" ControlToValidate="password2TextBox" Display="Dynamic" ErrorMessage="Password and Confirm Password must be the same!" Font-Italic="True" Font-Names="Arial" ForeColor="#FF3300"></asp:CompareValidator>
                        </td>
                    <td class="auto-style57" style="border-color: #FFFFFF; padding-left: 5px; background-color: #FFFFFF; border-right-style: solid; border-bottom-style: solid; border-top-style: solid;">
                        &nbsp;</td>
                </tr>
            </table>
            <table align="center" class="auto-style13" style="border: thin solid #CCFFCC">
                <tr>
                    <td class="auto-style58" style="text-align: right; font-family: Arial; font-style: italic; ">
                        <asp:Button ID="Button1" runat="server" Height="32px" Text="Clear" Width="126px" />
                    </td>
                    <td class="auto-style27" style="text-align: right; font-family: Arial; font-style: italic; text-decoration: blink;">
                        <asp:Button ID="Button2" runat="server" Height="32px" Text="Confirm" Width="126px" />
                    </td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
