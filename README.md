# CSC 131 Project - CalTrans PDF Management Tool

## Step #1: Downloads and Installation
### Become a Contributor
* Click the "Fork" button at the top right of the website to become a contributor to this project.
* If you're unfamiliar with Git or how GitHub works, it may be helpful to read the documentation: https://docs.github.com/en/get-started
* A video that may also be useful: https://www.youtube.com/watch?v=nhNq2kIvi9s

### Dependencies
* Windows (x32 or x64) or MacOS (x64)
* Any IDE capable of running Java Projects (Preferably [Eclipse](https://www.eclipse.org/downloads/))
* [Java Development Kit](https://www.oracle.com/java/technologies/downloads/#jdk17-windows) (JDK)
* [LibreOffice](https://www.libreoffice.org/download/download)
* [GitHub Desktop](https://desktop.github.com/)
* [Adobe Acrobat Reader](https://get.adobe.com/reader/) (Optional)

### Installation
1. Install any IDE capable of efficiently running Java Projects (Preferably [Eclipse](https://www.eclipse.org/downloads/))
2. Make sure you have the Java Development Kit installed. To check, just open a command prompt (or terminal) and type `java --version`.
    - If an error occurs, download and install the latest version [here](https://www.oracle.com/java/technologies/downloads/#jdk17-windows).
3. Download [LibreOffice](https://www.libreoffice.org/download/download) and run the installer. Once finished, make sure you're able to run a program called "LibreOffice Draw."
4. Download [GitHub Desktop](https://desktop.github.com/) and run the installer.
5. Finally, as an **optional step**, you can install [Adobe Acrobat Reader](https://get.adobe.com/reader/) (Optional) to get a better idea of how our PDF files will look and function in the field.

### Verification
* Verify that your installed IDE of choice opens and functions without issue.
* Verify that you now have the Java Development Kit (JDK) installed properly by typing `java --version` in a command prompt or terminal window.
* Open LibreOffice Draw and open any PDF file `File > Open`. If successful, you've properly installed LibreOffice.
* Login to GitHub Desktop and clone this repository to your local machine: `File > Clone Repository > csc131-project`
* If you've chosen to install Adobe Acrobat Reader, simply repeat the steps for LibreOffice to verify it works.

If everything is successful, congratulations! You're ready to start coding. If not, feel free to shoot a message in the project Discord and I'll answer as quickly as possible.

## Step #2: Getting Started
* Start your IDE and click `File > Import`, then choose `Existing Maven Project`.
    - You **must** import it as a *Maven* project or it won't open properly.
    - **FYI**: Maven is a Java project management tool made by Apache, which is the library being used for this project.
* Start LibreOffice Draw and open the PDF included in this repository titled `pdf-java.pdf`.
* Go to `View > Toolbars > Form Controls`, then press the little dropdown arrow on the menu that pops up and hit `Dock Toolbar`
    - This places all the tools we (should) need for this project at the top of the program for easier access.
    - I've added a couple of text boxes and labels onto the document for you to play around with.
* Next, right-click either of the two text-entry boxes on the form and press `Control Properties`.
    - This allows us to edit any attribute of this item on the form, whether through Java code (easier) or manually through the menu.
    - Don't mistake it for `Form Properties`, as that is completely different and lists the attributes of the entire file itself.
* Finally, there's a `PDFtest.java` file in the `main` package that manipulates the elements currently on the `pdf-java.pdf` file.
    - As a final test, try editing the strings in this file to something different like "Hello, World" and run the program.
    - If it runs without any errors, congrats! You should open the PDF to see that your changes were applied and saved.
    - Please feel free to make any additional classes, modules, interfaces, etc., as you like - given they have comments to explain what they do.

## Step #3: Resources and Submitting Code
### Resources and Helpful Links
* Markdown for updating README or LICENSE: [here](https://www.markdownguide.org/basic-syntax/)
* PDFBox Documentation (Library): [here](http://pdfbox.org)
* A simplified guide to setting things up: [here](https://dev.to/sandrogiacom/how-to-create-and-fill-out-your-own-pdf-form-with-java-87b)
* Discord invite in case you can't login or lose access to your account: [here](https://discord.gg/t2WvUKhHAA)
## Authors

Contributor names and *contact info**:

* Ryan Farruggia (rjfarruggia@csus.edu)
* Mahroona Yasar (mahroonayasar@csus.edu)
* Tran Chi (tranchi@csus.edu)
* Bikram Singh (bikramsingh@csus.edu)
* Catalina Wanchai (catalinawanchai@csus.edu)
* Raphael Guerrero
* David Quintanilla

## Version History

* 0.1
    * Initial Release

## License

* This project is licensed under the [MIT] License - see the LICENSE.md file for details

## Acknowledgments

* To be added at a future date
