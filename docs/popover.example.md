# Popover Examples

## Overview

Popovers display contextual content and interactive elements in a floating panel.

```html
<wa-popover for="popover__overview">
  <div style="display: flex; flex-direction: column; gap: 1rem;">
    <p>This popover contains interactive content that users can engage with directly.</p>
    <wa-button variant="primary" size="small">Take Action</wa-button>
  </div>
</wa-popover>

<wa-button id="popover__overview">Show popover</wa-button>
```

## Assigning an Anchor

Use `<wa-button>` or `<button>` elements as popover anchors. Connect the popover to its anchor by setting the for attribute to match the anchor's id.

```html
<wa-button id="popover__anchor-button">Show Popover</wa-button>

<wa-popover for="popover__anchor-button"> I'm anchored to a Web Awesome button. </wa-popover>

<br /><br />

<button id="popover__anchor-native-button">Show Popover</button>

<wa-popover for="popover__anchor-native-button"> I'm anchored to a native button. </wa-popover>
```

Make sure the anchor element exists in the DOM before the popover connects. If it doesn't exist, the popover won't attach and you'll see a console warning.

## Opening and Closing

Popovers show when you click their anchor element. You can also control them programmatically by setting the open property to true or false.

Use data-popover="close" on any button inside a popover to close it automatically.

```html
<wa-popover for="popover__opening">
  <p>The button below has <code>data-popover="close"</code> so clicking it will close the popover.</p>
  <wa-button data-popover="close" variant="primary">Dismiss</wa-button>
</wa-popover>

<wa-button id="popover__opening">Show popover</wa-button>
```

## Placement

Use the placement attribute to set where the popover appears relative to its anchor. The popover will automatically reposition if there isn't enough space in the preferred location. The default placement is top.

```html
<div style="display: flex; gap: 1rem; align-items: center;">
  <wa-button id="popover__top">Top</wa-button>
  <wa-popover for="popover__top" placement="top">I'm on the top</wa-popover>

  <wa-button id="popover__bottom">Bottom</wa-button>
  <wa-popover for="popover__bottom" placement="bottom">I'm on the bottom</wa-popover>

  <wa-button id="popover__left">Left</wa-button>
  <wa-popover for="popover__left" placement="left">I'm on the left</wa-popover>

  <wa-button id="popover__right">Right</wa-button>
  <wa-popover for="popover__right" placement="right">I'm on the right</wa-popover>
</div>
```

## Distance

Use the distance attribute to control how far the popover appears from its anchor.

```html
<div style="display: flex; gap: 1rem; align-items: center;">
  <wa-button id="popover__distance-near">Near</wa-button>
  <wa-popover for="popover__distance-near" distance="0">I'm very close</wa-popover>

  <wa-button id="popover__distance-far">Far</wa-button>
  <wa-popover for="popover__distance-far" distance="30">I'm farther away</wa-popover>
</div>
```

## Arrow Size

Use the --arrow-size custom property to change the size of the popover's arrow. Set it to 0 to remove the arrow entirely.

```html
<div style="display: flex; gap: 1rem; align-items: center;">
  <wa-button id="popover__big-arrow">Big arrow</wa-button>
  <wa-popover for="popover__big-arrow" style="--arrow-size: 8px;">I have a big arrow</wa-popover>

  <wa-button id="popover__no-arrow">No arrow</wa-button>
  <wa-popover for="popover__no-arrow" style="--arrow-size: 0;">I don't have an arrow</wa-popover>
</div>
```

## Setting a Maximum Width

Use the --max-width custom property to control the maximum width of the popover.

```html
<wa-button id="popover__max-width">Toggle me</wa-button>
<wa-popover for="popover__max-width" style="--max-width: 160px;">
  Popovers will usually grow to be much wider, but this one has a custom max width that forces text to wrap.
</wa-popover>
```

## Setting Focus

Use the autofocus global attribute to move focus to a specific form control when the popover opens.

```html
<wa-popover for="popover__autofocus">
  <div style="display: flex; flex-direction: column; gap: 1rem;">
    <wa-textarea autofocus placeholder="What's on your mind?" size="small" resize="none" rows="3"></wa-textarea>
    <wa-button variant="primary" size="small" data-popover="close"> Submit </wa-button>
  </div>
</wa-popover>

<wa-button id="popover__autofocus">
  <wa-icon name="comment" slot="start"></wa-icon>
  Feedback
</wa-button>
```

## Angular Component Example

```typescript
import { Component } from '@angular/core';
import { WaPopoverDirective, WaButtonComponent } from '@angular-awesome/components';

@Component({
  selector: 'app-popover-demo',
  template: `
    <wa-button id="popover-demo">Show Popover</wa-button>
    
    <wa-popover for="popover-demo">
      <div style="display: flex; flex-direction: column; gap: 1rem;">
        <p>This is a popover with interactive content.</p>
        <wa-button variant="primary" size="small" data-popover="close">Close</wa-button>
      </div>
    </wa-popover>
  `,
  standalone: true,
  imports: [WaPopoverDirective, WaButtonComponent]
})
export class PopoverDemoComponent {}
```

## Programmatic Control

```typescript
import { Component, ViewChild, ElementRef } from '@angular/core';
import { WaPopoverDirective, WaButtonComponent } from '@angular-awesome/components';

@Component({
  selector: 'app-programmatic-popover',
  template: `
    <wa-button id="programmatic-popover">Popover Target</wa-button>
    
    <wa-popover #myPopover for="programmatic-popover">
      <div style="display: flex; flex-direction: column; gap: 1rem;">
        <p>This popover is controlled programmatically.</p>
        <wa-button variant="primary" size="small" (click)="hidePopover()">Close</wa-button>
      </div>
    </wa-popover>
    
    <div style="margin-top: 1rem;">
      <wa-button variant="secondary" (click)="togglePopover()">Toggle Popover</wa-button>
    </div>
  `,
  standalone: true,
  imports: [WaPopoverDirective, WaButtonComponent]
})
export class ProgrammaticPopoverComponent {
  @ViewChild('myPopover') popover!: ElementRef;
  
  togglePopover() {
    const popoverEl = this.popover.nativeElement;
    popoverEl.open = !popoverEl.open;
  }
  
  hidePopover() {
    const popoverEl = this.popover.nativeElement;
    popoverEl.hide();
  }
}
```

## Event Handling

```typescript
import { Component } from '@angular/core';
import { WaPopoverDirective, WaButtonComponent } from '@angular-awesome/components';

@Component({
  selector: 'app-popover-events',
  template: `
    <wa-button id="popover-events">Show Popover</wa-button>
    
    <wa-popover 
      for="popover-events"
      (wa-show)="onShow()"
      (wa-after-show)="onAfterShow()"
      (wa-hide)="onHide()"
      (wa-after-hide)="onAfterHide()"
    >
      <div style="display: flex; flex-direction: column; gap: 1rem;">
        <p>This popover emits events when shown or hidden.</p>
        <wa-button variant="primary" size="small" data-popover="close">Close</wa-button>
      </div>
    </wa-popover>
    
    <div style="margin-top: 1rem;">
      <p>Event log:</p>
      <pre>{{ eventLog }}</pre>
    </div>
  `,
  standalone: true,
  imports: [WaPopoverDirective, WaButtonComponent]
})
export class PopoverEventsComponent {
  eventLog: string = '';
  
  onShow() {
    this.logEvent('wa-show: Popover is about to show');
  }
  
  onAfterShow() {
    this.logEvent('wa-after-show: Popover is now visible');
  }
  
  onHide() {
    this.logEvent('wa-hide: Popover is about to hide');
  }
  
  onAfterHide() {
    this.logEvent('wa-after-hide: Popover is now hidden');
  }
  
  private logEvent(message: string) {
    this.eventLog = `${message}\n${this.eventLog}`;
  }
}
```