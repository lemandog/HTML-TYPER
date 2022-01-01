import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class TagsWindowController implements Initializable {
    public WebView pageLoader;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pageLoader.getEngine().loadContent("""
<table class="table table-bordered">
<tbody><tr>
<th width="30%">Tag</th>
<th>Description</th>
</tr>
<tr>
<td>&lt;!--...--&gt;</td><td>Specifies a comment</td>
</tr>
<tr>
<td>&lt;!DOCTYPE&gt;</td>
<td>Specifies the document type</td>
</tr>
<tr>
<td>&lt;a&gt;</td>
<td>Specifies an anchor</td>
</tr>
<tr>
<td>&lt;abbr&gt;</td>
<td>Specifies an abbreviation</td>
</tr>
<tr>
<td>&lt;acronym&gt;</td>
<td><span class="bold">Deprecated:</span>Specifies an acronym</td>
</tr>
<tr>
<td>&lt;address&gt;</td>
<td>Specifies an address element</td>
</tr>
<tr>
<td>&lt;applet&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies an applet</td>
</tr>
<tr>
<td>&lt;area&gt;</td>
<td>Specifies an area inside an image map</td>
</tr>
<tr>
<td>&lt;article&gt;</td>
<td><span class="bold">New Tag:</span> Specifies an independent piece of content of a document, such as a blog entry or newspaper article</td>
</tr>
<tr>
<td>&lt;aside&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a piece of content that is only slightly related to the rest of the page.</td>
</tr>
<tr>
<td>&lt;audio&gt;</td>
<td><span class="bold">New Tag:</span>Specifies an audio file.</td>
</tr>
<tr>
<td>&lt;base&gt;</td>
<td>Specifies a base URL for all the links in a page</td>
</tr>
<tr>
<td>&lt;basefont&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies a base font</td>
</tr>
<tr>
<td>&lt;bdo&gt;</td>
<td>Specifies the direction of text display</td>
</tr>
<tr>
<td>&lt;bgsound&gt;</td>
<td>Specifies the background music</td>
</tr>
<tr>
<td>&lt;blink&gt;</td>
<td>Specifies a text which blinks</td>
</tr>
<tr>
<td>&lt;blockquote&gt;</td>
<td>Specifies a long quotation</td>
</tr>
<tr>
<td>&lt;body&gt;</td>
<td>Specifies the body element</td>
</tr>
<tr>
<td>&lt;br&gt;</td>
<td>Inserts a single line break</td>
</tr>
<tr>
<td>&lt;button&gt;</td>
<td>Specifies a push button</td>
</tr>
<tr>
<td>&lt;canvas&gt;</td>
<td><span class="bold">New Tag:</span>This is used for rendering dynamic bitmap graphics on the fly, such as graphs or games.</td>
</tr>
<tr>
<td>&lt;caption&gt;</td>
<td>Specifies a table caption</td>
</tr>
<tr>
<td>&lt;center&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies centered text</td>
</tr>
<tr>
<td>&lt;col&gt;</td>
<td>Specifies attributes for table columns&nbsp;</td>
</tr>
<tr>
<td>&lt;colgroup&gt;</td>
<td>Specifies groups of table columns</td>
</tr>
<tr>
<td>&lt;command&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a command the user can invoke.</td>
</tr>
<tr>
<td>&lt;comment&gt;</td>
<td>Puts a comment in the document</td>
</tr>
<tr>
<td>&lt;datalist&gt;</td>
<td><span class="bold">New Tag:</span>Together with the a new list attribute for input can be used to make comboboxes</td>
</tr>
<tr>
<td>&lt;dd&gt;</td>
<td>Specifies a definition description</td>
</tr>
<tr>
<td>&lt;del&gt;</td>
<td>Specifies deleted text</td>
</tr>
<tr>
<td>&lt;details&gt;</td>
<td><span class="bold">New Tag:</span>Specifies additional information or controls which the user can obtain on demand.</td>
</tr>
<tr>
<td>&lt;dir&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies a directory list</td>
</tr>
<tr>
<td>&lt;div&gt;</td>
<td>Specifies a section in a document</td>
</tr>
<tr>
<td>&lt;dl&gt;</td>
<td>Specifies a definition list</td>
</tr>
<tr>
<td>&lt;dt&gt;</td>
<td>Specifies a definition term</td>
</tr>
<tr>
<td>&lt;embed&gt;</td>
<td><span class="bold">New Tag:</span>Defines external interactive content or plugin.</td>
</tr>
<tr>
<td>&lt;fieldset&gt;</td>
<td>Specifies a fieldset</td>
</tr>
<tr>
<td>&lt;figure&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a piece of self-contained flow content, typically referenced as a single unit from the main flow of the document.</td>
</tr>
<tr>
<td>&lt;b&gt;</td>
<td>Specifies bold text</td>
</tr>
<tr>
<td>&lt;big&gt;</td>
<td><span class="bold">Deprecated:</span>Specifies big text</td>
</tr>
<tr>
<td>&lt;i&gt;</td>
<td>Specifies italic text</td>
</tr>
<tr>
<td>&lt;small&gt;</td>
<td>Specifies small text</td>
</tr>
<tr>
<td>&lt;tt&gt;</td>
<td><span class="bold">Deprecated:</span>Specifies teletype text</td>
</tr>
<tr>
<td>&lt;font&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies text font, size, and color</td>
</tr>
<tr>
<td>&lt;footer&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a footer for a section and can contain information about the author, copyright information, et cetera.</td>
</tr>
<tr>
<td>&lt;form&gt;</td>
<td>Specifies a form&nbsp;</td>
</tr>
<tr>
<td>&lt;frame&gt;</td>
<td><span class="bold">Deprecated:</span>Specifies a sub window (a frame)</td>
</tr>
<tr>
<td>&lt;frameset&gt;</td>
<td><span class="bold">Deprecated:</span>Specifies a set of frames</td>
</tr>
<tr>
<td>&lt;head&gt;</td>
<td>Specifies information about the document</td>
</tr>
<tr>
<td>&lt;header&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a group of introductory or navigational aids.</td>
</tr>
<tr>
<td>&lt;hgroup&gt;</td>
<td><span class="bold">New Tag:</span>Specifies the header of a section.</td>
</tr>
<tr>
<td>&lt;h1&gt; to &lt;h6&gt;</td>
<td> Specifies header 1 to header 6</td>
</tr>
<tr>
<td>&lt;hr&gt;</td>
<td> Specifies a horizontal rule</td>
</tr>
<tr>
<td>&lt;html&gt;</td>
<td>Specifies an html document</td>
</tr>
<tr>
<td>&lt;isindex&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies a single-line input field</td>
</tr>
<tr>
<td>&lt;iframe&gt;</td>
<td>Specifies an inline sub window (frame)</td>
</tr>
<tr>
<td>&lt;ilayer&gt;</td>
<td>Specifies an inline layer</td>
</tr>
<tr>
<td>&lt;img&gt;</td>
<td>Specifies an image</td>
</tr>
<tr>
<td>&lt;input&gt;</td>
<td>Specifies an input field</td>
</tr>
<tr>
<td>&lt;ins&gt;</td>
<td>Specifies inserted text</td>
</tr>
<tr>
<td>&lt;keygen&gt;</td>
<td><span class="bold">New Tag:</span>Specifies control for key pair generation.</td>
</tr>
<tr>
<td>&lt;keygen&gt;</td>
<td>Generate key information in a form</td>
</tr>
<tr>
<td>&lt;label&gt;</td>
<td>Specifies a label&nbsp;for a form control</td>
</tr>
<tr>
<td>&lt;layer&gt;</td>
<td>Specifies a layer</td>
</tr>
<tr>
<td>&lt;legend&gt;</td>
<td>Specifies a title in a fieldset</td>
</tr>
<tr>
<td>&lt;li&gt;</td>
<td>Specifies a list item</td>
</tr>
<tr>
<td>&lt;link&gt;</td>
<td>Specifies a resource reference </td>
</tr>
<tr>
<td>&lt;map&gt;</td>
<td>Specifies an image map&nbsp;</td>
</tr>
<tr>
<td>&lt;mark&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a run of text in one document marked or highlighted for reference purposes, due to its relevance in another context.</td>
</tr>
<tr>
<td>&lt;marquee&gt;</td>
<td>Create a scrolling-text marquee</td>
</tr>
<tr>
<td>&lt;menu&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies a menu list</td>
</tr>
<tr>
<td>&lt;meta&gt;</td>
<td>Specifies meta information</td>
</tr>
<tr>
<td>&lt;meter&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a measurement, such as disk usage.</td>
</tr>
<tr>
<td>&lt;multicol&gt;</td>
<td>Specifies a multicolumn text flow</td>
</tr>
<tr>
<td>&lt;nav&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a section of the document intended for navigation. </td>
</tr>
<tr>
<td>&lt;nobr&gt;</td>
<td>No breaks allowed in the enclosed text</td>
</tr>
<tr>
<td>&lt;noembed&gt;</td>
<td>Specifies content to be presented by browsers that do not support the &lt;embed&gt;tag</td>
</tr>
<tr>
<td>&lt;noframes&gt;</td><td><span class="bold">Deprecated:</span>Specifies a noframe section</td>
</tr>
<tr>
<td>&lt;noscript&gt;</td>
<td>Specifies a noscript section</td>
</tr>
<tr>
<td>&lt;object&gt;</td>
<td>Specifies an embedded object</td>
</tr>
<tr>
<td>&lt;ol&gt;</td>
<td>Specifies an ordered list</td>
</tr>
<tr>
<td>&lt;optgroup&gt;</td>
<td>Specifies an option group</td>
</tr>
<tr>
<td>&lt;option&gt;</td>
<td>Specifies an option in a drop-down list</td>
</tr>
<tr>
<td>&lt;output&gt;</td>
<td><span class="bold">New Tag:</span>Specifies some type of output, such as from a calculation done through scripting.</td>
</tr>
<tr>
<td>&lt;p&gt;</td>
<td>Specifies a paragraph</td>
</tr>
<tr>
<td>&lt;param&gt;</td>
<td>Specifies a parameter for an object</td>
</tr>
<tr>
<td>&lt;cite&gt;</td>
<td>Specifies a citation</td>
</tr>
<tr>
<td>&lt;code&gt;</td>
<td>Specifies computer code text</td>
</tr>
<tr>
<td>&lt;dfn&gt;</td>
<td>Specifies&nbsp;a definition term</td>
</tr>
<tr>
<td>&lt;em&gt;</td>
<td>Specifies emphasized text&nbsp;</td>
</tr>
<tr>
<td>&lt;kbd&gt;</td>
<td>Specifies keyboard text</td>
</tr>
<tr>
<td>&lt;samp&gt;</td>
<td>Specifies sample computer code</td>
</tr>
<tr>
<td>&lt;strong&gt;</td>
<td>Specifies strong text</td>
</tr>
<tr>
<td>&lt;var&gt;</td>
<td>Specifies a variable</td>
</tr>
<tr>
<td>&lt;plaintext&gt;</td><td><span class="bold">Deprecated:</span> Render the raminder of the document  as  preformatted  plain text</td>
</tr>
<tr>
<td>&lt;pre&gt;</td>
<td>Specifies preformatted text</td>
</tr>
<tr>
<td>&lt;progress&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a completion of a task, such as downloading or when performing a series of expensive operations.</td>
</tr>
<tr>
<td>&lt;q&gt;</td><td>Specifies a short quotation</td>
</tr>
<tr>
<td>&lt;ruby&gt;</td>
<td><span class="bold">New Tag:</span>Together with &lt;rt&gt; and &lt;rp&gt; allow for marking up ruby annotations.</td>
</tr>
<tr>
<td>&lt;script&gt;</td><td>Specifies a script</td>
</tr>
<tr>
<td>&lt;section&gt;</td>
<td><span class="bold">New Tag:</span>Represents a generic document or application section.</td>
</tr>
<tr>
<td>&lt;select&gt;</td>
<td>Specifies a selectable list</td>
</tr>
<tr>
<td>&lt;spacer&gt;</td>
<td>Specifies a white space</td>
</tr>
<tr>
<td>&lt;span&gt;</td>
<td>Specifies a section in a document</td>
</tr>
<tr>
<td>&lt;s&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies strikethrough text</td>
</tr>
<tr>
<td>&lt;strike&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies strikethrough text</td>
</tr>
<tr>
<td>&lt;style&gt;</td>
<td>Specifies a style definition</td>
</tr>
<tr>
<td>&lt;sub&gt;</td>
<td>Specifies subscripted text</td>
</tr>
<tr>
<td>&lt;sup&gt;</td>
<td>Specifies superscripted text</td>
</tr>
<tr>
<td>&lt;table&gt;</td>
<td>Specifies a table</td>
</tr>
<tr>
<td>&lt;tbody&gt;</td>
<td>Specifies a table body</td>
</tr>
<tr>
<td>&lt;td&gt;</td>
<td>Specifies a table cell</td>
</tr>
<tr>
<td>&lt;textarea&gt;</td>
<td>Specifies a text area</td>
</tr>
<tr>
<td>&lt;tfoot&gt;</td>
<td>Specifies a table footer</td>
</tr>
<tr>
<td>&lt;th&gt;</td>
<td>Specifies a table header</td>
</tr>
<tr>
<td>&lt;thead&gt;</td>
<td>Specifies a table header</td>
</tr>
<tr>
<td>&lt;time&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a date and/or time.</td>
</tr>
<tr>
<td>&lt;title&gt;</td>
<td>Specifies the document title</td>
</tr>
<tr>
<td>&lt;tr&gt;</td>
<td>Specifies a table row</td>
</tr>
<tr>
<td>&lt;u&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies underlined text</td>
</tr>
<tr>
<td>&lt;ul&gt;</td>
<td>Specifies an unordered list</td>
</tr>
<tr>
<td>&lt;video&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a video file.</td>
</tr>
<tr>
<td>&lt;wbr&gt;</td>
<td><span class="bold">New Tag:</span>Specifies a line break opportunity.</td>
</tr>
<tr>
<td>&lt;wbr&gt;</td>
<td>Indicate a potential word break point within a &lt;nobr&gt; section</td>
</tr>
<tr>
<td>&lt;xmp&gt;</td>
<td><span class="bold">Deprecated:</span> Specifies preformatted text</td>
</tr>
</tbody></table>                """);
    }
}
