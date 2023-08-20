<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="VBAutoCenterForm1.aspx.cs" Inherits="VBAutoCenter.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style2 {
            width: 100%;
        }
        .auto-style3 {
            height: 23px;
            width: 482px;
        }
        .auto-style4 {
            height: 25px;
            width: 482px;
        }
        .auto-style11 {
            width: 482px;
        }
        .auto-style15 {
            width: 226px;
        }
        .auto-style16 {
            height: 23px;
            width: 226px;
        }
        .auto-style17 {
            height: 25px;
            width: 226px;
        }
        .auto-style19 {
            width: 226px;
            height: 26px;
        }
        .auto-style20 {
            width: 482px;
            height: 26px;
        }
        .auto-style21 {
            width: 272px;
        }
        .auto-style22 {
            height: 23px;
            width: 272px;
        }
        .auto-style23 {
            width: 272px;
            height: 26px;
        }
        .auto-style24 {
            height: 25px;
            width: 272px;
        }
        .auto-style25 {
            width: 236px;
        }
        .auto-style26 {
            height: 23px;
            width: 236px;
        }
        .auto-style27 {
            width: 236px;
            height: 26px;
        }
        .auto-style28 {
            height: 25px;
            width: 236px;
        }
        .auto-style29 {
            width: 236px;
            height: 27px;
        }
        .auto-style30 {
            width: 226px;
            height: 27px;
        }
        .auto-style31 {
            width: 272px;
            height: 27px;
        }
        .auto-style32 {
            width: 482px;
            height: 27px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        </div>
        <table class="auto-style2" border="0" style="background-color: #FFCC99; border-collapse: collapse;">
            <tr>
                <td class="auto-style26" style="border-top-style: solid; border-width: thin; border-color: #FF6600; border-left-style: solid;">Accessories</td>
                <td class="auto-style16" style="border-top-style: solid; border-width: thin; border-color: #FF6600"></td>
                <td class="auto-style22" style="border-right-style: solid; border-width: thin; border-color: #FF6600; border-top-style: solid;"></td>
            </tr>
            <tr>
                <td class="auto-style26" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:CheckBox ID="checkBox1" runat="server" Text="Stereo System" />
                </td>
                <td class="auto-style16" style="text-align: right">Car Sales Price</td>
                <td class="auto-style22" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="carSalesTextBox" runat="server" Width="262px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style27" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:CheckBox ID="checkBox2" runat="server" Text="Leather Interiors" />
                </td>
                <td class="auto-style19" style="text-align: right">Trade-in Allowance</td>
                <td class="auto-style23" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="tradeInTextBox" runat="server" Width="262px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style27" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:CheckBox ID="checkBox3" runat="server" Text="Computer Navigation" />
                </td>
                <td class="auto-style19" style="text-align: right">Accessories and Finish</td>
                <td class="auto-style23" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="accAndFinTextBox" runat="server" Width="262px" ReadOnly="True"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style26" style="border-left-style: solid; border-width: thin; border-color: #FF6600">Finish</td>
                <td class="auto-style16" style="text-align: right">Subtotal</td>
                <td class="auto-style22" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="subTotalTextBox" runat="server" Width="262px" ReadOnly="True"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style28" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:RadioButton ID="radioButton1" runat="server" GroupName="Finish" Text="Standard" />
                </td>
                <td class="auto-style17" style="text-align: right">Sales Tax</td>
                <td class="auto-style24" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="salesTaxTextBox" runat="server" Width="262px" ReadOnly="True"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style29" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:RadioButton ID="radioButton2" runat="server" GroupName="Finish" Text="Pearlized" />
                </td>
                <td class="auto-style30" style="text-align: right">Total</td>
                <td class="auto-style31" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="totalTextBox" runat="server" Width="262px" ReadOnly="True"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style25" style="border-left-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:RadioButton ID="radioButton3" runat="server" GroupName="Finish" Text="Customized Detailing" />
                </td>
                <td class="auto-style15" style="text-align: right">Amount \Due</td>
                <td class="auto-style21" style="border-right-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:TextBox ID="amountOrDueTextBox" runat="server" Width="262px" ReadOnly="True"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style25" style="border-left-style: solid; border-width: thin; border-color: #FF6600">&nbsp;</td>
                <td class="auto-style15">&nbsp;</td>
                <td class="auto-style21" style="border-right-style: solid; border-width: thin; border-color: #FF6600">&nbsp;</td>
            </tr>
            <tr style="border-bottom-style: solid; border-width: thin; border-color: #FF6600">
                <td class="auto-style25" style="border-left-style: solid; border-width: thin; border-color: #FF6600; border-bottom-style: solid;">&nbsp;</td>
                <td class="auto-style15" style="border-bottom-style: solid; border-width: thin; border-color: #FF6600">
                    <asp:Button ID="calculateButton" runat="server" OnClick="calculateButton_Click" Text="Calculate" Width="192px" />
                </td>
                <td class="auto-style21" style="border-right-style: solid; border-width: thin; border-color: #FF6600; border-bottom-style: solid;">
                    <asp:Button ID="clearButton" runat="server" OnClick="clearButton_Click" Text="Clear" Width="192px" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
