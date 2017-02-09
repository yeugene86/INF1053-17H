import { Gary3000Page } from './app.po';

describe('gary3000 App', function() {
  let page: Gary3000Page;

  beforeEach(() => {
    page = new Gary3000Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
